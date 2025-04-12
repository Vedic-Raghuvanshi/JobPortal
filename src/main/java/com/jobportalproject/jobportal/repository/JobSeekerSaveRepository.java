package com.jobportalproject.jobportal.repository;

import com.jobportalproject.jobportal.entity.JobPostActivity;
import com.jobportalproject.jobportal.entity.JobSeekerProfile;
import com.jobportalproject.jobportal.entity.JobSeekerSave;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobSeekerSaveRepository extends JpaRepository<JobSeekerSave, Integer> {

    public List<JobSeekerSave> findByUserId(JobSeekerProfile userAccountId);

    List<JobSeekerSave> findByJob(JobPostActivity job);

}