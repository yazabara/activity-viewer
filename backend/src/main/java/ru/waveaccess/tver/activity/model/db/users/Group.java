package ru.waveaccess.tver.activity.model.db.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "Activity_groups")
@Access(AccessType.FIELD)
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "title")
    private String title;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ownerId")
    private ActivityUser owner;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "Users_Groups", joinColumns = {@JoinColumn(name = "groupId")}, inverseJoinColumns = {@JoinColumn(name = "userId")})
    private List<ActivityUser> users;
}
