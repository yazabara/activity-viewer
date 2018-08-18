package ru.waveaccess.tver.activity.model.pricing;

import ru.waveaccess.tver.activity.model.Event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CostGroup {

    @Id
    private Long id;

    private Event event;

    private Double сonstituentCostAmount;

    private String description;
}
