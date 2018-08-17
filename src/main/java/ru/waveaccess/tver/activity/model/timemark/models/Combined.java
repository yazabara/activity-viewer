package ru.waveaccess.tver.activity.model.timemark.models;

import ru.waveaccess.tver.activity.model.timemark.TimeMarkModel;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Combined extends TimeMarkModel {

    private List<TimeMarkModel> possibleDates;
}
