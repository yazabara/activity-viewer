package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import java.sql.Date;

public class Regular extends RegularWithGaps {

    private Date baseDate;

    private Long periodDays;

    private Date till;

}
