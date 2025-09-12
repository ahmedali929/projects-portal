package com.company.projectportal.repository;

import com.company.projectportal.entity.JobPostActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface JobPostActivityRepository extends JpaRepository<JobPostActivity, Integer> {

    List<IRecruiterJobs> getRecruiterJobs(@Param("recruiter") int recruiter);
}
