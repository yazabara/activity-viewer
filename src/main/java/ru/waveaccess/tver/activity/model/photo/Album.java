package ru.waveaccess.tver.activity.model.photo;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Album {

    @Id
    private Long id;

    private String folderName;

    private List<Photo> photos;
}
