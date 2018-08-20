package ru.waveaccess.tver.activity.model.timemark;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
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
