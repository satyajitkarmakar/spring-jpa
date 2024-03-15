package com.practice.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_sequence"
    )
    @SequenceGenerator(
            name = "author_sequence",
            sequenceName = "author_sequence",
            allocationSize = 1
    )
    private Integer authorId;

    private String firstName;

    private String lastName;

    @Column(unique = true, nullable = false )
    private String email;

    private int age;
}
