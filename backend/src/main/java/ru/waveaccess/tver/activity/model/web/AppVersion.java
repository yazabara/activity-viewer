package ru.waveaccess.tver.activity.model.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class AppVersion {

    private String version;
    private String buildDate;
    private String buildBy;
    private String company;
    private String gitRevision;
}
