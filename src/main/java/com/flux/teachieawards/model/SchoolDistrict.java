package com.flux.teachieawards.model;

import com.flux.teachieawards.model.audit.DateAudit;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "school_districts")
public class SchoolDistrict extends DateAudit {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JoinColumn(name = "school_district_id")
    private int schoolDistrictId;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 6)
    private String shortName;

    @NotBlank
    @Size(max = 60)
    private String state;

    public SchoolDistrict() {

    }

    public SchoolDistrict(int schoolDistrictId, String name, String shortName, String state) {
        this.schoolDistrictId = schoolDistrictId;
        this.name = name;
        this.shortName = shortName;
        this.state = state;
    }

    public int getSchoolDistrictId() {
        return schoolDistrictId;
    }

    public void setSchoolDistrictId(int schoolDistrictId) {
        this.schoolDistrictId = schoolDistrictId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
