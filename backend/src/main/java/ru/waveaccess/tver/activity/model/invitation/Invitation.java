package ru.waveaccess.tver.activity.model.invitation;

import ru.waveaccess.tver.activity.model.users.ActivityUser;

import javax.persistence.*;

@Entity
@Table(name = "PersonalInvitations")
@Access(AccessType.FIELD)
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "userId")
    private ActivityUser user;

    @ManyToOne
    @JoinColumn(name = "invitePolicyId")
    private InvitePolicy invitePolicy;
}
