package ru.waveaccess.tver.activity.model.chat;

import org.springframework.data.annotation.Id;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class ActivityChat {

    @Id
    private Long id;

    private List<ChatMessage> messages;


}
