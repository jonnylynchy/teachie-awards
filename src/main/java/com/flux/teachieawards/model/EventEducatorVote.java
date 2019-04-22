package com.flux.teachieawards.model;

import com.flux.teachieawards.model.audit.DateAudit;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Educator Votes
 */
@Entity
@Table(name = "event_educator_votes")

public class EventEducatorVote extends DateAudit {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "vote_id")
    public int voteId;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name = "event_id")
    @NotNull(message = "*Please provide an event")
    public Event event;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @NotNull(message = "*Please provide a user")
    private User user;

    @ManyToOne(cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name = "educator_id")
    @NotNull(message = "*Please provide an educator")
    private User educator;

    public EventEducatorVote() {

    }

    public EventEducatorVote(Event event, User user, User educator) {
        this.event = event;
        this.user = user;
        this.educator = educator;
    }

}   