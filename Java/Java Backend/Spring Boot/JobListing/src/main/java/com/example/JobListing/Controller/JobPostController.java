package com.example.JobListing.Controller;

import com.example.JobListing.Model.JobPost;
import com.example.JobListing.Repository.JobPostRepository;
import com.example.JobListing.Repository.SearchRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.batch.BatchProperties;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

@RestController
public class JobPostController {

    @Autowired
    JobPostRepository repo;

    @Autowired
    SearchRepository searchRepo;

    @GetMapping("/jobPosts")
    public List<JobPost> getAllJobPosts(){
        return repo.findAll();
    }

    @GetMapping("/jobPosts/{text}")
    public List<JobPost> search(@PathVariable String text){
        return searchRepo.findByText(text);
    }

    @PostMapping("/addJobPost")
    public JobPost addJobPost(@RequestBody JobPost jobPost){
        return repo.save(jobPost);
    }
}