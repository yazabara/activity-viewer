package ru.waveaccess.tver.activity.service;

import ru.waveaccess.tver.activity.model.db.event.Event;

public interface EventService {

    boolean addEvent(Event event);

    Iterable<Event> events();
}
