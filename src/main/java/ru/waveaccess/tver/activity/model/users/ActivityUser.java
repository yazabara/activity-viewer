package ru.waveaccess.tver.activity.model.users;

import ru.waveaccess.tver.activity.model.event.Interest;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.List;

@Entity
public class ActivityUser {

    @Id
    private Long id;

    private String name;
    private String surname;

    private Date birthDate;

    private String avatarPath;

    private String position;

    private Interest[] interests;

    private String email;
    private String skype;

    private List<Group> groups;

}
