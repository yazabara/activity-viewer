package ru.waveaccess.tver.activity.model.timemark;

import javax.persistence.Id;
import java.sql.Date;

public class RegularWithExceptions extends TimeMarkModel {

    @Id
    private Long id;

    private Date[] exceptions;
}
