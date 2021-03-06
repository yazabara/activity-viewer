package ru.waveaccess.tver.activity.model.db.invitation.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.db.invitation.Invitation;
import ru.waveaccess.tver.activity.model.db.invitation.InvitePolicy;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.List;

//policy for private events with restricted members
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class StrictInvitePolicy extends InvitePolicy {

    @OneToMany(mappedBy = "invitePolicy", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Invitation> invitations;
}
