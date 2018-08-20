package ru.waveaccess.tver.activity.model.event;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import ru.waveaccess.tver.activity.model.chat.ActivityChat;
import ru.waveaccess.tver.activity.model.condition.Condition;
import ru.waveaccess.tver.activity.model.invitation.InvitePolicy;
import ru.waveaccess.tver.activity.model.photo.Album;
import ru.waveaccess.tver.activity.model.pricing.CostGroup;
import ru.waveaccess.tver.activity.model.pricing.Debt;
import ru.waveaccess.tver.activity.model.pricing.PricingModel;
import ru.waveaccess.tver.activity.model.timemark.TimeMarkModel;
import ru.waveaccess.tver.activity.model.users.ActivityUser;
import ru.waveaccess.tver.activity.model.users.Responsible;
import ru.waveaccess.tver.activity.model.voting.Voting;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import java.util.List;

@Data
@EqualsAndHashCode
@ToString
@NoArgsConstructor

@Entity
@Access(AccessType.FIELD)
@Table(name = "Events")
public class Event {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "authorId")
    private Long authorId;
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "authorId")
    private ActivityUser author;

    @Column(name = "title")
    private String title;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Events_Interests", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "interestId") })
    private List<Interest> activityType;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Events_Tags", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "tagId") })
    private List<Tag> tags;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Events_Responsibles", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "userId") })
    private List<Responsible> responsibles;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Events_FinalParticipants", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "userId") })
    private List<ActivityUser> participants;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "Events_NonFinalParticipants", joinColumns = { @JoinColumn(name = "eventId") }, inverseJoinColumns = { @JoinColumn(name = "userId") })
    private List<ActivityUser> possibleParticipants;

    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.EAGER)
    private List<Condition> conditionsToBeMet;

    @Column(name = "isPrivate")
    private Boolean privateEvent;
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private InvitePolicy invitePolicy;

    @Column(name = "htmlDescription")
    private String htmlDescription;
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Album descriptionImages;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Voting> votings;
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private ActivityChat chat;

    @Column(name = "location")
    private String location;
    @Column(name = "rootExternalLink")
    private String rootExternalLink;
    @Column(name = "meetingPlace")
    private String meetingPlace;
    @Column(name = "equipmentDescription")
    private String equipmentDescription;

    @Column(name = "isDateApproximate")
    private Boolean isDateApproximate;
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private TimeMarkModel timeMarkModel;

    @Column(name = "totalCostAmount")
    private Double totalCostAmount;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<CostGroup> costByConstituent;
    @OneToOne(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private PricingModel pricingModel;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Debt> debts;

    @Column(name = "externalLink")
    private String externalLink;
    @OneToMany(mappedBy = "event", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<Album> photoReport;
}
