package ru.waveaccess.tver.activity.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.model.event.Event;
import ru.waveaccess.tver.activity.repository.EventRepository;
import ru.waveaccess.tver.activity.service.EventService;

@Service
@AllArgsConstructor
public class EventServiceImpl implements EventService {

    private final EventRepository eventRepository;

    public boolean addEvent(Event event) {
        eventRepository.save(event);
        return false;
    }

    public Iterable<Event> events() {
        return eventRepository.findAll();
    }
}
