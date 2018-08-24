package ru.waveaccess.tver.activity.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

public interface UserRepository extends PagingAndSortingRepository<ActivityUser, Long> {
}
