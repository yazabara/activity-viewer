package ru.waveaccess.tver.activity.model;

import ru.waveaccess.tver.activity.model.condition.Condition;
import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;
import ru.waveaccess.tver.activity.model.photo.Album;
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
import java.util.List;

@Entity
public class Event {

    @Id
    private Long id;

    private String title;
    private Interest activityType;
    private List<String> tags;

    private ActivityUser author;

    private List<Responsible> responsibles;
    private List<ActivityUser> participants;
    private List<ActivityUser> possibleParticipants;

    private List<Condition> conditionsToBeMet;

    private Boolean privateEvent;
    private InvitePolicy invitePolicy;

    private String htmlDescription;
    private Album descriptionImages;
    private List<Voting> votings;

    private String place;
    private String rootExternalLink;
    private String meetingPlace;
    private String equipmentDescription;

    private Boolean isDateApproximate;
    private TimeMarkModel timeMarkModel;

    private Double totalCostAmount;
    private CostGroup[] costByСonstituent;
    private PricingModel pricingModel;
    private List<Debt> debts;

    private String externalLink;
    private List<Album> photoReport;
}
