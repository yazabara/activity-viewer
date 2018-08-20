package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.event.Event;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
