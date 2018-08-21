package ru.waveaccess.tver.activity.model.condition.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.condition.Condition;

import javax.persistence.Column;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class MinimalParticipants extends Condition {

    @Column(name = "participantsCount")
    private Long participantsCount;
}
