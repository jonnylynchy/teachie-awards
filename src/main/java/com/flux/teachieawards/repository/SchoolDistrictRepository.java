package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.SchoolDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SchoolDistrictRepository extends JpaRepository<SchoolDistrict, Integer> {
    // Custom method for finding a School District by it's name
    SchoolDistrict findSchoolDistrictByName(String name);
}
