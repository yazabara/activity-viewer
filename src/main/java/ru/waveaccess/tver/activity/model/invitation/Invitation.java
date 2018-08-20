package ru.waveaccess.tver.activity.model.invitation;

import org.apache.catalina.User;

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
