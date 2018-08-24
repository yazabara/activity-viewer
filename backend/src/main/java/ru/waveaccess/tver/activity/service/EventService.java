package ru.waveaccess.tver.activity.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.model.event.Event;
import ru.waveaccess.tver.activity.repository.EventRepository;

@Service
@Slf4j
public class EventService {

    private final EventRepository eventRepository;

    public EventService(EventRepository eventRepository) {
        this.eventRepository = eventRepository;
    }

    public boolean addEvent(Event event) {
        log.info("Add event process starts for {}", event);
        eventRepository.save(event);
        return false;
    }

    public Iterable<Event> events() {
        return eventRepository.findAll();
    }
}
