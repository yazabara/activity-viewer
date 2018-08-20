package ru.waveaccess.tver.activity.model.invitation.models;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;
import ru.waveaccess.tver.activity.model.users.Group;

import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//event notifications will be received by group members
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor
public class GroupInvitePolicy extends InvitePolicy {

    @Column(name = "groupId")
    private Long groupId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "groupId")
    private Group group;
}
