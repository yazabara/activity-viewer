package ru.waveaccess.tver.activity.model.photo;

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
public class Photo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fileName")
    private String fileName;

    @Column(name = "albumId")
    private Long albumId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "albumId")
    private Album album;

    @OneToMany(mappedBy = "photo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Comment> comments;

    @OneToMany(mappedBy = "photo", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Rate> rating;

}
