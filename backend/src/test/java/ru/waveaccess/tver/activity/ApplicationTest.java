package ru.waveaccess.tver.activity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import ru.waveaccess.tver.activity.model.db.event.Event;
import ru.waveaccess.tver.activity.model.db.users.ActivityUser;
import ru.waveaccess.tver.activity.repository.EventRepository;
import ru.waveaccess.tver.activity.repository.UserRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testEventInsert() {
        Event event = new Event();
        ActivityUser author = new ActivityUser();
        author.setName("Vasya");
        userRepository.save(author);
        event.setTitle("new1 event");
        event.setAuthor(author);
        event = eventRepository.save(event);
    }
}