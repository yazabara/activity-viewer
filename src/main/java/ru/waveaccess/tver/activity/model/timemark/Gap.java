package ru.waveaccess.tver.activity.model.timemark;

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

    @Column(name = "timeModelId")
    private Long timeModelId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "timeModelId")
    private RegularWithGaps timeModel;

    @Column(name = "gapDate")
    private Date gapDate;

}
