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

    @Column(name = "userId")
    private Long userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "interestId")
    private Long interestId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "interestId")
    private Interest interest;

    @Column(name = "tagId")
    private Long tagId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "tagId")
    private Tag tag;
}
