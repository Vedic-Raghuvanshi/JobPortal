package com.jobportalproject.jobportal.repository;

import com.jobportalproject.jobportal.entity.JobPostActivity;
import com.jobportalproject.jobportal.entity.JobSeekerApply;
import com.jobportalproject.jobportal.entity.JobSeekerProfile;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerApplyRepository extends JpaRepository<JobSeekerApply, Integer> {

    List<JobSeekerApply> findByUserId(JobSeekerProfile userId);

    List<JobSeekerApply> findByJob(JobPostActivity job);
}