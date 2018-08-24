package ru.waveaccess.tver.activity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import ru.waveaccess.tver.activity.model.db.event.Event;

@Repository
public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
}
