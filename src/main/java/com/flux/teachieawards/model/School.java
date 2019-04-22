package com.flux.teachieawards.model;

import com.flux.teachieawards.model.audit.DateAudit;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Schools
 */
@Entity
@Table(name = "schools")
public class School extends DateAudit {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "school_id")
    private int schoolId;

    @NotBlank
    @Size(max = 100)
    private String name;

    @NotBlank
    @Size(max = 60)
    private String streetAddress1;

    @Size(max = 60)
    private String streetAddress2;

    @NotBlank
    @Size(max = 60)
    private String country;

    @NotBlank
    @Size(max = 60)
    private String city;

    @NotBlank
    @Size(max = 60)
    private String state;

    @NotBlank
    @Size(max = 12)
    private String zipPostalCode;

    @NotBlank
    @Size(max = 25)
    private String schoolType;

    @ManyToOne
    @JoinColumn(name = "school_district_id")
    @NotNull(message = "*Please provide a school district")
    private SchoolDistrict schoolDistrict;

    public School() {

    }

    public School(int schoolId, String name, String streetAddress1, String streetAddress2, String country, String city,
            String state, String zipPostalCode, String schoolType) {
        this.schoolId = schoolId;
        this.name = name;
        this.streetAddress1 = streetAddress1;
        this.streetAddress2 = streetAddress2;
        this.country = country;
        this.city = city;
        this.state = state;
        this.zipPostalCode = zipPostalCode;
        this.schoolType = schoolType;
    }

    public int getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(int schoolId) {
        this.schoolId = schoolId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreetAddress1() {
        return streetAddress1;
    }

    public void setStreetAddress1(String streetAddress1) {
        this.streetAddress1 = streetAddress1;
    }

    public String getStreetAddress2() {
        return streetAddress2;
    }

    public void setStreetAddress2(String streetAddress2) {
        this.streetAddress2 = streetAddress2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZipPostalCode() {
        return zipPostalCode;
    }

    public void setZipPostalCode(String zipPostalCode) {
        this.zipPostalCode = zipPostalCode;
    }

    public String getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(String schoolType) {
        this.schoolType = schoolType;
    }
}