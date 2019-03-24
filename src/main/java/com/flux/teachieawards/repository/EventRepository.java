package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.Event;
import com.flux.teachieawards.model.School;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface EventRepository extends JpaRepository<Event, Integer> {
    // Custom method to find event by it's name label
    Event findEventByName(String name);

    // Custom method to find events by their associated school
    List<Event> findEventsBySchool(School school);
}
