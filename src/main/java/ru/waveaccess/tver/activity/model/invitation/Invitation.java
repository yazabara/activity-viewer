package ru.waveaccess.tver.activity.model.invitation;

import org.apache.catalina.User;

import javax.persistence.*;

@Entity
@Table(name = "PersonalInvitations")
@Access(AccessType.FIELD)
public class Invitation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "userId")
    private Long userId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    @Column(name = "invitePolicyId")
    private Long invitePolicyId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "invitePolicyId")
    private InvitePolicy invitePolicy;
}
