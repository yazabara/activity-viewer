package ru.waveaccess.tver.activity.model.db.photo;

import ru.waveaccess.tver.activity.model.db.event.Event;
import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

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

    @ManyToOne
    @JoinColumn(name = "eventId")
    private Event event;

    @ManyToOne
    @JoinColumn(name = "ownerId")
    private ActivityUser owner;

    @Column(name = "folderName")
    private String folderName;

    @OneToMany(mappedBy = "album", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Photo> photos;
}
