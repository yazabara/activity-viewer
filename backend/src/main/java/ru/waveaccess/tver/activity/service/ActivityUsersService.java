package ru.waveaccess.tver.activity.service;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import java.util.List;

public interface ActivityUsersService {
	List<ActivityUser> getAll();

	ActivityUser getOne(Long userId);

	void saveNew(ActivityUser activityUser);

	void update(ActivityUser activityUser);

	void delete(Long userId);
}
