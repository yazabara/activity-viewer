package ru.waveaccess.tver.activity.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.stereotype.Service;
import ru.waveaccess.tver.activity.service.MessagesService;

@Service
@AllArgsConstructor
public class MessagesServiceImpl implements MessagesService {

    private final MessageSourceAccessor accessor;

    @Override
    public String getMessage(String code, Object... args) {
        return accessor.getMessage(code, args);
    }
}
