package com.flux.teachieawards.controller;

import com.flux.teachieawards.exception.ResourceNotFoundException;
import com.flux.teachieawards.model.School;
import com.flux.teachieawards.model.SchoolDistrict;
import com.flux.teachieawards.payload.*;
import com.flux.teachieawards.repository.SchoolDistrictRepository;
import com.flux.teachieawards.repository.SchoolRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SchoolController {

    @Autowired
    private SchoolRepository schoolRepository;

    @Autowired
    private SchoolDistrictRepository schoolDistrictRepository;

    private static final Logger logger = LoggerFactory.getLogger(SchoolController.class);

    /**
     * List of all schools
     * 
     * @return
     */
    @GetMapping("/schools")
    public List<School> list() {
        List<School> schoolList = schoolRepository.findAll();
        return schoolList;
    }

    /**
     * List of all school districts
     * 
     * @return
     */
    @GetMapping("/schooldistricts")
    public List<SchoolDistrict> listDistricts() {
        List<SchoolDistrict> schoolDistrictList = schoolDistrictRepository.findAll();
        return schoolDistrictList;
    }

    /**
     * List of all schools by school district
     * 
     * @param schoolDistrictId
     * @return
     */
    @RequestMapping(value = "/schools/district/{schoolDistrictId}", method = RequestMethod.GET)
    public List<School> listBySchoolDistrictId(@PathVariable int schoolDistrictId) {
        SchoolDistrict schoolDistrict = schoolDistrictRepository.getOne(schoolDistrictId);
        List<School> schoolList = schoolRepository.findSchoolsBySchoolDistrict(schoolDistrict);
        return schoolList;
    }

}