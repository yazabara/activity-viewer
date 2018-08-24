package ru.waveaccess.tver.activity.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.waveaccess.tver.activity.model.web.AppVersion;

@RestController
@RequiredArgsConstructor
public class VersionController {

    private final AppVersion version;

    @GetMapping("/version")
    public AppVersion getVersion() {
        return version;
    }
}
