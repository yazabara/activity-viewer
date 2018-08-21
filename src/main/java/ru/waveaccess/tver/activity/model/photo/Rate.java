package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;

@Entity
@Table(name = "PhotoRates")
@Access(AccessType.FIELD)
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "value")
    private Long value;

    @ManyToOne
    @JoinColumn(name = "photoId")
    private Photo photo;

}
