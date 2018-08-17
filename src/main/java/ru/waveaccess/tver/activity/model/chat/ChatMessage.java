package ru.waveaccess.tver.activity.model.chat;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

@Entity
public class ChatMessage {

    @Id
    private Long id;

    private ActivityChat chat;

    private ActivityUser user;

    private Timestamp timestamp;
}
