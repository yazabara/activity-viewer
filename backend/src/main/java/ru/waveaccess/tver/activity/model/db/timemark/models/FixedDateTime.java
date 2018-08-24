package ru.waveaccess.tver.activity.model.db.timemark.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.timemark.TimeMarkModel;

import javax.persistence.Column;
import java.sql.Timestamp;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class FixedDateTime extends TimeMarkModel {

    @Column(name = "fixedDateTime")
    private Timestamp fixedDateTime;
}
