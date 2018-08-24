package ru.waveaccess.tver.activity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.waveaccess.tver.activity.model.event.Interest;

public interface InterestRepository extends PagingAndSortingRepository<Interest, Long> {
}
