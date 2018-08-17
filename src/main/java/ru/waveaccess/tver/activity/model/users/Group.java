package ru.waveaccess.tver.activity.model.users;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Group {

    @Id
    private Long id;

    private List<ActivityUser> users;
}
