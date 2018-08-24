package ru.waveaccess.tver.activity.service;

import ru.waveaccess.tver.activity.model.db.event.Interest;

import java.util.List;

public interface InterestService {
	List<Interest> getAll();

	Interest getOne(Long interestId);

	void saveNew(Interest interest);

	void update(Interest interest);

	void delete(Long interestId);
}
