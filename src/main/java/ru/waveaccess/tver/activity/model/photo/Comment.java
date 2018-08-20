package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

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
