package ru.waveaccess.tver.activity.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
public class AppVersion implements Serializable {

    public static final String UNKNOWN = "unknown";

    private String date = AppVersion.UNKNOWN;
    private String version = AppVersion.UNKNOWN;
    private GitInfo git = null;

    @Data
    @AllArgsConstructor
    public static class GitInfo {

        private String commit;
        private String branch;
    }
}
