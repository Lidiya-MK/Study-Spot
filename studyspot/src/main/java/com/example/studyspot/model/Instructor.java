package com.example.studyspot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer instructorId;

    @Column(nullable = false)
    private String fullname;

    @Column(nullable = false)
    private String universityName;

    @Column(nullable = false)
    private String fieldOfStudy;

    @ElementCollection
    private List<Integer> verifiedTutorials; 

    private String profilePicture; 

    private String resume; 

    @Column(nullable = false)
    private String email;

    private Boolean approved = false; 

    
}
