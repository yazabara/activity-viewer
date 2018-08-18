package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import javax.persistence.Entity;

@Entity
public class WeekRegular extends RegularWithGaps {

    private Long dayOfWeek;

}
