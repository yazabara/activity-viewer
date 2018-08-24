package ru.waveaccess.tver.activity.model.db.pricing;

import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

import javax.persistence.*;

@Entity
@Table(name = "PaidUserQuote")
@Access(AccessType.FIELD)
public class PaidUserQuote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @ManyToOne
    @JoinColumn(name = "pricingModelId")
    private PricingModel pricingModel;

    @Column(name = "assignedQuoteAbsolute")
    private Double assignedQuoteAbsolute;

    @Column(name = "assignedQuotePercent")
    private Double assignedQuotePercent;

}
