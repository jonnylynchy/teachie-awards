package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.EventEducatorVote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventEducatorVoteRepository extends JpaRepository<EventEducatorVote, Integer> {
}
