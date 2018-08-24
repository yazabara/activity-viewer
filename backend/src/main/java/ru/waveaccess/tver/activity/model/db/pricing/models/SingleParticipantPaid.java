package ru.waveaccess.tver.activity.model.db.pricing.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.pricing.PricingModel;
import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class SingleParticipantPaid extends PricingModel {

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "paidUserId")
    private ActivityUser paidUser;
}
