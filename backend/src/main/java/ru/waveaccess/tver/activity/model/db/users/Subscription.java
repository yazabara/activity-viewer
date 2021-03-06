package ru.waveaccess.tver.activity.model.db.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.event.Interest;
import ru.waveaccess.tver.activity.model.db.event.Tag;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Access(AccessType.FIELD)
@Table(name = "Subscriptions")
public class Subscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @ManyToOne
    @JoinColumn(name = "interestId")
    private Interest interest;

    @ManyToOne
    @JoinColumn(name = "tagId")
    private Tag tag;
}
