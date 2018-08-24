package ru.waveaccess.tver.activity.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.exceptions.ActivityUserDataException;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.repository.UserRepository;
import ru.waveaccess.tver.activity.service.ActivityUsersService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ActivityUserServiceImpl implements ActivityUsersService {

	private final UserRepository userRepository;

	@Override
	public List<ActivityUser> getAll() {
		return (List<ActivityUser>) userRepository.findAll();
	}

	@Override
	public ActivityUser getOne(Long userId) {
		return userRepository.findById(userId).orElseThrow(() -> new ActivityUserDataException("User with id = " + userId + " not found"));
	}

	@Override
	public void saveNew(ActivityUser activityUser) {
		userRepository.save(activityUser);
	}

	@Override
	public void update(ActivityUser activityUser) {
		userRepository.save(activityUser);
	}

	@Override
	public void delete(Long userId) {
		userRepository.deleteById(userId);
	}
}
