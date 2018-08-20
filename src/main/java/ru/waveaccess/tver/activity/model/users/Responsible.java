package ru.waveaccess.tver.activity.model.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "Responsibilities")
@Access(AccessType.FIELD)
public class Responsible {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId")
    private Long userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "responsibility")
    private String responsibility;
}
