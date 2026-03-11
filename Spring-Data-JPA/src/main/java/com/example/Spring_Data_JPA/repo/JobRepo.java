package com.example.Spring_Data_JPA.repo;


import com.example.Spring_Data_JPA.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {












}