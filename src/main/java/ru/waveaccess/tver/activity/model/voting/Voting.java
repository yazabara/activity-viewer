package ru.waveaccess.tver.activity.model.voting;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Voting {

    @Id
    private Long id;

    private String title;

    private List<Option> options;
}
