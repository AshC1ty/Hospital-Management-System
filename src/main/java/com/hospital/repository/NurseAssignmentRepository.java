package com.hospital.repository;


import com.hospital.model.NurseAssignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NurseAssignmentRepository extends JpaRepository<NurseAssignment, Integer> {
    // You can add custom query methods here if needed
}
