package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import javax.persistence.Entity;

@Entity
public class Annual extends RegularWithGaps {

    private Long month;
    private Long dayOfMonth;

}

