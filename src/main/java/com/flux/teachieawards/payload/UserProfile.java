package com.flux.teachieawards.payload;

import java.time.Instant;

public class UserProfile {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private Instant joinedAt;
    // private Long pollCount;
    // private Long voteCount;

    public UserProfile(int id, String username, String firstName, String lastName, Instant joinedAt) {
        this.id = id;
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.joinedAt = joinedAt;
        // this.pollCount = pollCount;
        // this.voteCount = voteCount;
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

    public Instant getJoinedAt() {
        return joinedAt;
    }

    public void setJoinedAt(Instant joinedAt) {
        this.joinedAt = joinedAt;
    }

    // Once votes are added
    // public Long getPollCount() {
    // return pollCount;
    // }

    // public void setPollCount(Long pollCount) {
    // this.pollCount = pollCount;
    // }

    // public Long getVoteCount() {
    // return voteCount;
    // }

    // public void setVoteCount(Long voteCount) {
    // this.voteCount = voteCount;
    // }
}