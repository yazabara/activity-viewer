package ru.waveaccess.tver.activity.model.chat;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;
import java.sql.Timestamp;

@Data
@EqualsAndHashCode
@ToString(exclude = "chat")
@NoArgsConstructor

@Entity
@Access(AccessType.FIELD)
@Table(name = "ChatMessages")
public class ChatMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chatId")
    private ActivityChat chat;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @Column(name = "timestamp")
    private Timestamp timestamp;
}
