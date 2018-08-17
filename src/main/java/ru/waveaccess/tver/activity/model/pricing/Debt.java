package ru.waveaccess.tver.activity.model.pricing;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Debt {

    @Id
    private Long id;

    private ActivityUser user;

    private Double debt;
}
