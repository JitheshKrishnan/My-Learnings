package com.example.JobListing.Repository;

import com.example.JobListing.Model.JobPost;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface JobPostRepository extends MongoRepository<JobPost, String> {
}