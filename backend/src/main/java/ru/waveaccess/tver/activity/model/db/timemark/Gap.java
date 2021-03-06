package ru.waveaccess.tver.activity.model.db.timemark;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.sql.Date;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "Gaps")
@Access(AccessType.FIELD)
public class Gap {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "timeModelId")
    private TimeMarkModel timeModel;

    @Column(name = "gapDate")
    private Date gapDate;

}
