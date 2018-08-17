package ru.waveaccess.tver.activity.model.users;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Interest {

    @Id
    private Long id;

    private String description;
}
