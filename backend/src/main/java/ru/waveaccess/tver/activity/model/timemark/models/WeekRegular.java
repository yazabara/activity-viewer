package ru.waveaccess.tver.activity.model.timemark.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.timemark.RegularWithGaps;

import javax.persistence.Column;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class WeekRegular extends RegularWithGaps {

    @Column(name = "regularDayOfWeek")
    private Long dayOfWeek;

}
