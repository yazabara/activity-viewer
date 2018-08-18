package ru.waveaccess.tver.activity.model.timemark;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Gap {

    @Id
    private Long id;

    private RegularWithGaps timeModel;

    private Date gapDate;

}
