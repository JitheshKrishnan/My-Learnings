package com.example.JobListing.Repository;

import com.example.JobListing.Model.JobPost;

import java.util.List;

public interface SearchRepository {
    public List<JobPost> findByText(String text);
}
