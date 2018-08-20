package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.event.Event;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Albums")
@Access(AccessType.FIELD)
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "eventId")
    private Long eventId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "eventId")
    private Event event;

    @Column(name = "ownerId")
    private Long ownerId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ownerId")
    private ActivityUser owner;

    @Column(name = "folderName")
    private String folderName;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Photo> photos;
}
