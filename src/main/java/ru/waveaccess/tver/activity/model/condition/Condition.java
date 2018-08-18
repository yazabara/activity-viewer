package ru.waveaccess.tver.activity.model.condition;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Condition {

    @Id
    private Long id;

    private Boolean isMet;
}
