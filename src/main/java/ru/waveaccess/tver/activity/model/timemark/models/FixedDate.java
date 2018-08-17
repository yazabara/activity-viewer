package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.TimeMarkModel;

import javax.persistence.Entity;
import java.sql.Date;

@Entity
public class FixedDate extends TimeMarkModel {

    private Date fixedDate;
}
