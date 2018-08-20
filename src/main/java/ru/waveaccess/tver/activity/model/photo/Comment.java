package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;

@Entity
@Table(name = "PhotoComments")
@Access(AccessType.FIELD)
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "authorId")
    private Long authorId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authorId")
    private ActivityUser author;

    @Column(name = "text")
    private String text;

    @Column(name = "photoId")
    private Long photoId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "photoId")
    private Photo photo;

}