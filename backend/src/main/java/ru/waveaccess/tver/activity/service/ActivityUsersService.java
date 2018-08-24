package ru.waveaccess.tver.activity.service;

import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

import java.util.List;

public interface ActivityUsersService {
	List<ActivityUser> getAll();

	ActivityUser getOne(Long userId);

	Long saveNew(ActivityUser activityUser);

	void update(ActivityUser activityUser);

	void delete(Long userId);
}
