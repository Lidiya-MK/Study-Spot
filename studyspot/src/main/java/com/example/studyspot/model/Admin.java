package com.example.studyspot.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer adminId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    private String app; 

    @ElementCollection
    private List<Integer> studentIds; 

    @ElementCollection
    private List<Integer> instructorIds; 

    
}
