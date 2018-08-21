package ru.waveaccess.tver.activity.model.voting;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "VotingChoises")
@Access(AccessType.FIELD)
public class UserChoise {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @ManyToOne
    @JoinColumn(name = "optionId")
    private Option option;

    @Column(name = "timestamp")
    private Timestamp timestamp;
}
