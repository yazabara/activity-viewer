package ru.waveaccess.tver.activity.config;

import com.jcabi.manifests.Manifests;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.waveaccess.tver.activity.model.web.AppVersion;
import ru.waveaccess.tver.activity.service.MessagesService;

@Configuration
@Slf4j
@AllArgsConstructor
public class AppConfiguration {

    private final MessagesService messagesService;

    @Bean
    public AppVersion appVersion() {
        AppVersion version = new AppVersion();
        try {
            version.setVersion(Manifests.read("App-Version"));
            version.setDate(Manifests.read("Build-Date"));
            version.setGit(new AppVersion.GitInfo(
                    Manifests.read("Git-Commit"),
                    Manifests.read("Git-Branch")
            ));
            log.info(messagesService.getMessage("configuration.app.version", version));
        } catch (Exception e) {
            log.error(messagesService.getMessage("configuration.app.version.unable.to.get", e));
        }
        return version;
    }
}
