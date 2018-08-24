package ru.waveaccess.tver.activity.model.db.chat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.event.Event;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode
@ToString(exclude = "event")
@NoArgsConstructor

@Entity
@Access(AccessType.FIELD)
@Table(name = "Chats")
public class ActivityChat {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn(name = "eventId")
    private Event event;

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ChatMessage> messages;

}
