package ru.waveaccess.tver.activity.model.pricing.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.model.pricing.PricingModel;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class SingleParticipantPaid extends PricingModel {

    @Column(name = "paidUserId")
    private Long paidUserId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "paidUserId")
    private ActivityUser paidUser;
}
