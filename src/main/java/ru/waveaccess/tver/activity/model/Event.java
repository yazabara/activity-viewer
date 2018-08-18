package ru.waveaccess.tver.activity.model;

import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;
import ru.waveaccess.tver.activity.model.pricing.CostGroup;
import ru.waveaccess.tver.activity.model.pricing.Debt;
import ru.waveaccess.tver.activity.model.pricing.PricingModel;
import ru.waveaccess.tver.activity.model.timemark.TimeMarkModel;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.model.users.Interest;
import ru.waveaccess.tver.activity.model.users.Responsible;
import ru.waveaccess.tver.activity.model.voting.Voting;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event {

    @Id
    private Long id;

    private String title;

    private ActivityUser author;

    private Boolean confirmed;
    private String specialConditionToBeMet;
    private Integer minParticipantsCount;

    private Boolean privateEvent;
    private InvitePolicy invitePolicy;

    private String htmlDescription;

    private String place;
    private String equipmentDescription;

    private Interest activityType;
    private String[] tags;

    private TimeMarkModel timeMarkModel;

    private Double totalCostAmount;
    private CostGroup[] costByСonstituent;
    private PricingModel pricingModel;
    private Debt[] debts;

    private Responsible[] responsibles;

    private ActivityUser[] participants;

    private ActivityUser[] possibleParticipants;

    private String externalLink;

    private String[] images;
    private Voting[] votings;
    private String photoAlbumFolderName;
}
