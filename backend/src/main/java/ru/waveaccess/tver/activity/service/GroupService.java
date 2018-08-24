package ru.waveaccess.tver.activity.service;

import ru.waveaccess.tver.activity.model.db.users.Group;

import java.util.List;

public interface GroupService {
	List<Group> getAll();

	Group getOne(Long userId);

	void saveNew(Group group);

	void update(Group group);

	void delete(Long groupId);
}
