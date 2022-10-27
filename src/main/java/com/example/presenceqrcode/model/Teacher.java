package com.example.presenceqrcode.model;

import lombok.Data;
import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Teacher {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false, name="name")
    private String name;

    @Column(nullable = false, name="subject", unique = true)
    private String subject;

    @ElementCollection
    private List<String> studentsRa;

}
