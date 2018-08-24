package ru.waveaccess.tver.activity.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.exception.InterestDataException;
import ru.waveaccess.tver.activity.model.event.Interest;
import ru.waveaccess.tver.activity.repository.InterestRepository;
import ru.waveaccess.tver.activity.service.InterestService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InterestServiceImpl implements InterestService {

	private final InterestRepository interestRepository;

	@Override
	public List<Interest> getAll() {
		return (List<Interest>) interestRepository.findAll();
	}

	@Override
	public Interest getOne(Long interestId) {
		return interestRepository.findById(interestId).orElseThrow(() -> new InterestDataException("Interest with id = " + interestId + " not found"));
	}

	@Override
	public void saveNew(Interest interest) {
		interestRepository.save(interest);
	}

	@Override
	public void update(Interest interest) {
		interestRepository.save(interest);
	}

	@Override
	public void delete(Long interestId) {
		interestRepository.deleteById(interestId);
	}
}
