package com.company.entity;

import com.company.enums.ProofileStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "profils")
@Getter
@Setter
public class ProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false,unique = true)
    private String email;
    @Column(nullable = false)
    private String password;
    @Column
    @Enumerated
    private ProofileStatus status;
    @Column
    private LocalDateTime activeDate;
    @Column
    private LocalDateTime createDate = LocalDateTime.now();
}
