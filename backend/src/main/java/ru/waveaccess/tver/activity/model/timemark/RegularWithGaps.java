package ru.waveaccess.tver.activity.model.timemark;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import java.sql.Date;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class RegularWithGaps extends TimeMarkModel {

    @OneToMany(mappedBy = "timeModel", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Gap> gaps;

    @Column(name = "from")
    private Date from;

    @Column(name = "till")
    private Date till;
}
