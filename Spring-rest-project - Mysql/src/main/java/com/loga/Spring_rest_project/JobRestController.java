package com.loga.Spring_rest_project;

import com.loga.Spring_rest_project.model.JobPost;
import com.loga.Spring_rest_project.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController//allows you to return data
@CrossOrigin(origins = {"http://localhost:3000","http://localhost:3001"})
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("load")
    public String load(){
        service.load();
        return "succes";
    }

    @GetMapping("jobPosts")
    public List<JobPost> getalljobs() {
        return service.getalljobs();
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> search(@PathVariable String keyword){
        return service.search(keyword);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) //don't forget to put @Request body
    {
        service.addJob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getjob(jobPost.getPostId());
    }

    @DeleteMapping("jobPost/{postId}")
    public String deleteJob(@PathVariable int postId){
        service.deleteJob(postId);
        return "Deleted";
    }

    @GetMapping("jobPost/{postId}")
    public JobPost getjob(@PathVariable int postId) {
        return service.getjob(postId);
    }


}
