package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithExceptions;

import javax.persistence.Entity;

@Entity
public class MonthRegular extends RegularWithExceptions {

    private Long dayOfMonth;

}

