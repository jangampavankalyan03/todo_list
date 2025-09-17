package com.example.todo_list.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

enum Status {
    PENDING, COMPLETED
}

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Lists {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String notes;

    @CreatedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime createdAt;

    @LastModifiedDate
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime updated_at;

    @Enumerated(EnumType.STRING)
    private Status status;
}
