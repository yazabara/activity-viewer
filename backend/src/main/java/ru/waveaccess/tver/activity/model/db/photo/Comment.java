package ru.waveaccess.tver.activity.model.db.photo;

import ru.waveaccess.tver.activity.model.db.users.ActivityUser;

import javax.persistence.*;

@Entity
@Table(name = "PhotoComments")
@Access(AccessType.FIELD)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private ActivityUser author;

    @Column(name = "text")
    private String text;

    @ManyToOne
    @JoinColumn(name = "photoId")
    private Photo photo;

}
