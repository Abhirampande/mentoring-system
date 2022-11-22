package com.example.mentorsystembackend.controller;

import com.example.mentorsystembackend.model.Mentor;
import com.example.mentorsystembackend.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MentorController {
    @Autowired
    private MentorRepository mentorRepository;
    //get all mentor

    @GetMapping("/mentor")
    public List<Mentor> getAllMentor(){

        return mentorRepository.findAll();
    }

    //creating rest api
    @PostMapping("/mentor")
    public Mentor createMentor(@RequestBody Mentor mentor){
        return mentorRepository.save(mentor);
    }


}
