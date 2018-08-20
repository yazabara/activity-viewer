package ru.waveaccess.tver.activity.model.pricing;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "Debts")
@Access(AccessType.FIELD)
public class Debt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId")
    private Long userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "debt")
    private Double debt;
}
