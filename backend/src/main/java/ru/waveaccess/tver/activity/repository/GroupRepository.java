package ru.waveaccess.tver.activity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.waveaccess.tver.activity.model.db.users.Group;

public interface GroupRepository extends PagingAndSortingRepository<Group, Long> {
}
