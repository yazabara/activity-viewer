package ru.waveaccess.tver.activity.model.pricing;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PaidUserQuote")
@Access(AccessType.FIELD)
public class PaidUserQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId")
    private Long userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "pricingModelId")
    private Long pricingModelId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "pricingModelId")
    private PricingModel pricingModel;

    @Column(name = "assignedQuoteAbsolute")
    private Double assignedQuoteAbsolute;

    @Column(name = "assignedQuotePercent")
    private Double assignedQuotePercent;

}
