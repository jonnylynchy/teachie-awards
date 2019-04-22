package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.EventEducatorVote;
import com.flux.teachieawards.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventEducatorVoteRepository extends JpaRepository<EventEducatorVote, Integer> {
    List<EventEducatorVote> findEventEducatorVotesByUser(User user);
    List<EventEducatorVote> findEventEducatorVotesByEducator(User educator);
}
