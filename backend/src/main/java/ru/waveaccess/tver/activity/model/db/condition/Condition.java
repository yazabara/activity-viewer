package ru.waveaccess.tver.activity.model.db.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.event.Event;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString(exclude = "event")
@NoArgsConstructor

@Entity
@Table(name = "Conditions")
@Access(AccessType.FIELD)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "conditionType")
public class Condition {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;

    @Column(name = "isMet")
    private Boolean isMet;

    @ManyToOne
    @JoinColumn(name = "parentId")
    private Condition parent;

}
