package ru.waveaccess.tver.activity.model.pricing.models;

import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.model.pricing.PricingModel;

public class SingleParticipantPaid extends PricingModel {

    private ActivityUser paidUser;

    private Double totalAmount;
}
