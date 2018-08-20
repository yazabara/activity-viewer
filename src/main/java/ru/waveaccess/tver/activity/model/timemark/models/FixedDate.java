package ru.waveaccess.tver.activity.model.timemark.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.timemark.TimeMarkModel;

import javax.persistence.Column;
import java.sql.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class FixedDate extends TimeMarkModel {

    @Column(name = "fixedDate")
    private Date fixedDate;
}
