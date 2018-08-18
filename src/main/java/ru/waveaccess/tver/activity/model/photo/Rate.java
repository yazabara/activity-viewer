package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rate {

    @Id
    private Long id;

    private ActivityUser user;

    private Photo photo;

    private Long value;

}
