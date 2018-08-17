package ru.waveaccess.tver.activity.model.voting;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Option {

    @Id
    private Long id;

    private String text;
}
