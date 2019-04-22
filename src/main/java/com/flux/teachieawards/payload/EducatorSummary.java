package com.flux.teachieawards.payload;

import com.flux.teachieawards.model.EventEducatorVote;

import java.util.List;

public class EducatorSummary {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private List<EventEducatorVote> votes;

    public EducatorSummary(int id, String username, String firstName, String lastName, List<EventEducatorVote> votes) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.votes = votes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<EventEducatorVote> getVotes() {
        return votes;
    }

    public void setVotes(List<EventEducatorVote> votes) {
        this.votes = votes;
    }
}