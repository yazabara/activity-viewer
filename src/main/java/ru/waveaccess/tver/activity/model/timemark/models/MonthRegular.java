package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import javax.persistence.Entity;

@Entity
public class MonthRegular extends RegularWithGaps {

    private Long dayOfMonth;

}

