package ru.waveaccess.tver.activity.model.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Access(AccessType.FIELD)
@Table(name = "Interests")
public class Interest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;
}
