package ru.waveaccess.tver.activity.model.timemark;

import javax.persistence.Id;
import java.util.List;

public class RegularWithGaps extends TimeMarkModel {

    @Id
    private Long id;

    private List<Gap> gaps;
}
