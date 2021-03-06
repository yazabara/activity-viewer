package ru.waveaccess.tver.activity.model.db.pricing.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.pricing.PaidUserQuote;
import ru.waveaccess.tver.activity.model.db.pricing.PricingModel;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class NonUniform extends PricingModel {

    @OneToMany(mappedBy = "pricingModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PaidUserQuote> participantsQuotes;
}
