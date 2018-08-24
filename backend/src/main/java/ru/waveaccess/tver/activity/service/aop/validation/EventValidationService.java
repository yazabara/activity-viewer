package ru.waveaccess.tver.activity.service.aop.validation;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.exception.EventRuntimeException;
import ru.waveaccess.tver.activity.model.db.event.Event;

@Aspect
@Service
@Slf4j
public class EventValidationService {

    @Before("execution(* ru.waveaccess.tver.activity.service.EventService.addEvent(..)) && args(event)")
    public void validateAddEventMethod(Event event) {
        if (event == null) {
            throw new EventRuntimeException("Unable to add null event into system");
        }
        if (event.getAuthor() == null) {
            throw new EventRuntimeException("Unable to add event without author");
        }
    }
}
