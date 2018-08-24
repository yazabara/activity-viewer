package ru.waveaccess.tver.activity.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.exceptions.GroupDataException;
import ru.waveaccess.tver.activity.model.users.Group;
import ru.waveaccess.tver.activity.repository.GroupRepository;
import ru.waveaccess.tver.activity.service.GroupService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class GroupServiceImpl implements GroupService {

	private final GroupRepository groupRepository;

	@Override
	public List<Group> getAll() {
		return (List<Group>) groupRepository.findAll();
	}

	@Override
	public Group getOne(Long userId) {
		return groupRepository.findById(userId).orElseThrow(() -> new GroupDataException("Group with id = " + userId + " not found"));
	}

	@Override
	public void saveNew(Group group) {
		groupRepository.save(group);
	}

	@Override
	public void update(Group group) {
		groupRepository.save(group);
	}

	@Override
	public void delete(Long groupId) {
		groupRepository.deleteById(groupId);
	}
}
