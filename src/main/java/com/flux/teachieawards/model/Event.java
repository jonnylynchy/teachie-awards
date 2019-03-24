package com.flux.teachieawards.model;

import com.flux.teachieawards.model.audit.DateAudit;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "events")
public class Event extends DateAudit {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "event_id")
    private int eventId;


    // - schoolId (fk)
	// - eventId (pk)
	// - name
	// - start date
	// - end date

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate startDate;

    @NotBlank
    @DateTimeFormat(pattern = "MM/dd/yyyy")
    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "school_id")
    @NotNull(message = "*Please provide a school")
    private School school;

    public Event() {

    }

    public Event(int eventId, String name ) {
        this.eventId = eventId;
        this.name = name;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}