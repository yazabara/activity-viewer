package ru.waveaccess.tver.activity.service.aop.audit;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.model.event.Event;

@Service
@Aspect
@Slf4j
public class EventAuditService {

    @Before("execution(* ru.waveaccess.tver.activity.service.EventService.addEvent(..)) && args(event)")
    public void logAddEventStart(Event event) {
        log.info("Application starts [add event] process {}", event);
    }

    @After("execution(* ru.waveaccess.tver.activity.service.EventService.addEvent(..)) && args(event)")
    public void logAddEventEnd(Event event) {
        log.info("Application finished [add event] process {}", event);
    }
}
