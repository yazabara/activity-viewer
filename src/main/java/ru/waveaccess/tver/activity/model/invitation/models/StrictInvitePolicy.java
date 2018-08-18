package ru.waveaccess.tver.activity.model.invitation.models;

import ru.waveaccess.tver.activity.model.invitation.Invitation;
import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;

import java.util.List;

//policy for private events with restricted members
public class StrictInvitePolicy extends InvitePolicy {

    private List<Invitation> invitations;
}
