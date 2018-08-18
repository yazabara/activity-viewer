package ru.waveaccess.tver.activity.model.photo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Comment {

    @Id
    private Long id;

    private String text;

    private Photo photo;
}
