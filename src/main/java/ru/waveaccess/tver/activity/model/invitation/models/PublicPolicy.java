package ru.waveaccess.tver.activity.model.invitation.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;

//everybody will receive the invitations
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class PublicPolicy extends InvitePolicy {
}
