package ru.waveaccess.tver.activity.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import ru.waveaccess.tver.activity.Application;
import ru.waveaccess.tver.activity.exception.EventRuntimeException;
import ru.waveaccess.tver.activity.model.event.Event;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.repository.UserRepository;
import ru.waveaccess.tver.activity.service.impl.EventServiceImpl;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class EventServiceImplTest {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private EventService eventService;

    @Test(expected = EventRuntimeException.class)
    public void addEventShouldThrowExceptionIfObjectIsNull() {
        eventService.addEvent(null);
    }

    @Test(expected = EventRuntimeException.class)
    public void addEventShouldThrowExceptionIfAuthorIsNull() {
        Event event = new Event();
        eventService.addEvent(event);
    }

    @Test
    public void addEventShouldWorksCorrectForRightInput() {
        ActivityUser user = new ActivityUser();
        ActivityUser save = userRepository.save(user);

        Event event = new Event();
        event.setAuthor(user);

        eventService.addEvent(event);
        Iterable<Event> events = eventService.events();
        events.forEach(e -> {
            assertEquals(e.getAuthor(), save);
        });
    }

}