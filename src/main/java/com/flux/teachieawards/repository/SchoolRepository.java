/**
 * Schools
 */
package com.flux.teachieawards.repository;

import com.flux.teachieawards.model.School;
import com.flux.teachieawards.model.SchoolDistrict;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Integer> {
    // Custom method to find team by it's name label
    School findSchoolByName(String name);

    // Custom method to find teams by their associated league
    List<School> findSchoolsBySchoolDistrict(SchoolDistrict schoolDistrict);
}
