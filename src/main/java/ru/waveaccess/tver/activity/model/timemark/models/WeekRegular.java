package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithExceptions;

import javax.persistence.Entity;

@Entity
public class WeekRegular extends RegularWithExceptions {

    private Long dayOfWeek;

}
