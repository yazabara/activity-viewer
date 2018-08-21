package ru.waveaccess.tver.activity.model.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.event.Interest;
import ru.waveaccess.tver.activity.model.event.Tag;

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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "interestId")
    private Interest interest;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tagId")
    private Tag tag;
}
