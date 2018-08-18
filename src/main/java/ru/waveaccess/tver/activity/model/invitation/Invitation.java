package ru.waveaccess.tver.activity.model.invitation;

import org.apache.catalina.User;
import ru.waveaccess.tver.activity.model.Event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Invitation {

    @Id
    private Long id;

    private Event event;
    private User user;
}
