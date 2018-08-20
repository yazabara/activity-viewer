package ru.waveaccess.tver.activity.model.condition;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.event.Event;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
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

    @Column(name = "eventId")
    private Long eventId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "eventId")
    private Event event;

    @Column(name = "isMet")
    private Boolean isMet;

    @Column(name = "parentId")
    private Long parentId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "parentId")
    private Condition parent;

}
