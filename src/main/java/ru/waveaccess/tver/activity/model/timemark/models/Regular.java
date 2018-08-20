package ru.waveaccess.tver.activity.model.timemark.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import javax.persistence.Column;
import java.sql.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Regular extends RegularWithGaps {

    @Column(name = "regularFrom")
    private Date baseDate;

    @Column(name = "regularPeriod")
    private Long periodDays;

    @Column(name = "regularTo")
    private Date till;

}
