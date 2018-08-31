package ru.waveaccess.tver.activity.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import ru.waveaccess.tver.activity.model.web.AppVersion;

import java.io.Serializable;


@Data

@Configuration
@PropertySource(value = "classpath:version-info.properties", ignoreResourceNotFound = true)
public class AppVersionConfiguration implements Serializable {

    @Value("${version}")
    private String version;
    @Value("${build.date}")
    private String buildDate;
    @Value("${build.by}")
    private String buildBy;
    @Value("${company}")
    private String company;
    @Value("${jdk.version}")
    private String jdkVersion;
    @Value("${os.version}")
    private String osVersion;
    @Value("${git.revision}")
    private String gitRevision;

    public AppVersion appVersion() {
        return new AppVersion(version, buildDate, buildBy, company, gitRevision);
    }
}
