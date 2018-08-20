package ru.waveaccess.tver.activity.model.pricing;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;

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
