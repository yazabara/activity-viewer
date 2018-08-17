package ru.waveaccess.tver.activity.model.voting;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class UserChoise {

    @Id
    private Long id;

    private ActivityUser user;

    private Option option;

    private Timestamp timestamp;
}
