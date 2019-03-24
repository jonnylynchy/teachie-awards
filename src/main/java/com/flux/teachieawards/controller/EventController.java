package com.flux.teachieawards.controller;

import com.flux.teachieawards.model.Event;
import com.flux.teachieawards.model.School;
import com.flux.teachieawards.repository.EventRepository;
import com.flux.teachieawards.repository.SchoolRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EventController {

    @Autowired
    private EventRepository eventRepository;

    @Autowired
    private SchoolRepository schoolRepository;

    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);

    /**
     * List of all schools
     * 
     * @return
     */
    @GetMapping("/events")
    public List<Event> list() {
        List<Event> eventList = eventRepository.findAll();
        return eventList;
    }

    /**
     * List of all events by school
     * 
     * @param schoolId
     * @return
     */
    @RequestMapping(value = "/events/school/{schoolId}", method = RequestMethod.GET)
    public List<Event> listBySchoolId(@PathVariable int schoolId) {
        School school = schoolRepository.getOne(schoolId);
        List<Event> eventList = eventRepository.findEventsBySchool(school);
        return eventList;
    }

}