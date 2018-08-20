package ru.waveaccess.tver.activity.model.users;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.event.Interest;

import javax.persistence.*;
import java.sql.Date;
import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Table(name = "Users")
@Access(AccessType.FIELD)
public class ActivityUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;

    @Column(name = "birthDate")
    private Date birthDate;

    @Column(name = "avatarPath")
    private String avatarPath;

    @Column(name = "position")
    private String position;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Users_Interests", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "interestId")})
    private List<Interest> interests;

    @Column(name = "email")
    private String email;
    @Column(name = "skype")
    private String skype;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Users_Groups", joinColumns = {@JoinColumn(name = "userId")}, inverseJoinColumns = {@JoinColumn(name = "groupId")})
    private List<Group> groups;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Subscription> subscriptions;

}
