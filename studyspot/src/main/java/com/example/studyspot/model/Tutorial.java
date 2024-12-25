package com.example.studyspot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Tutorial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tutorialId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String fieldOfStudy;

    @Column(nullable = false)
    private String video; 

    private String readingMaterials; 

    @ElementCollection
    private List<String> comments; 

    @ElementCollection
    private List<Integer> likes; 

    private Boolean verified = false; 

    private String tutorialImage; 

    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student; 

    
}
