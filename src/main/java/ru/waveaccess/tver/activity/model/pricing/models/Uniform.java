package ru.waveaccess.tver.activity.model.pricing.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.pricing.PricingModel;

import javax.persistence.Column;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class Uniform extends PricingModel {

    @Column(name = "singleParticipantAmount")
    private Double singleParticipantAmount;
}
