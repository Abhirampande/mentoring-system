package com.example.mentorsystembackend.controller;

import com.example.mentorsystembackend.repository.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class MentorController {
    @Autowired
    private MentorRepository mentorRepository;
    //get all mentor

    @GetMapping("/mentor")
    public List<MentorRepository>getAllMentor(){
        return mentorRepository.findAll();
    }


}
