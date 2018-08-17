package ru.waveaccess.tver.activity.model.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Subscription {

    @Id
    private Long id;

    private ActivityUser user;

    private Interest interest;

    private String tag;
}
