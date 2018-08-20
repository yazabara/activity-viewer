package ru.waveaccess.tver.activity.model.invitation;

import ru.waveaccess.tver.activity.model.event.Event;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvitePolicy {

    @Id
    private Long id;

    private Long eventId;
    private Event event;

}
