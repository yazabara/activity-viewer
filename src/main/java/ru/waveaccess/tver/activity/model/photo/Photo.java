package ru.waveaccess.tver.activity.model.photo;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Photo {

    @Id
    private Long id;

    private ActivityUser owner;

    private String fileName;

    private Album album;

    private List<Comment> comments;

    private List<Rate> rating;

}
