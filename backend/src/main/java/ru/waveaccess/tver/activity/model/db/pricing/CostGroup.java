package ru.waveaccess.tver.activity.model.db.pricing;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.event.Event;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "CostGroups")
@Access(AccessType.FIELD)
public class CostGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;

    @Column(name = "сonstituentCostAmount")
    private Double сonstituentCostAmount;

    @Column(name = "description")
    private String description;
}
