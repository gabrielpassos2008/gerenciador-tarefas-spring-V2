package com.example.primeiro_thymeleaf.model;

import java.sql.Date;

public class Task {

    private Long id;
    private String name;
    private String status;
    private Date date;

    // Construtor vazio (obrigatório para o Spring)
    public Task() {
    }

    // Construtor completo
    public Task(Long id, String name, String status, Date date) {
        this.id = id;
        this.name = name;
        this.status = status;
        this.date = date;
    }

    // Get
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    public Date getDate() {
        return date;
    }

    // Set
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
