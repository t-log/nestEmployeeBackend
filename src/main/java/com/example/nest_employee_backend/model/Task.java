package com.example.nest_employee_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
    @Id
    @GeneratedValue
    private int id;
    private String status;
    private String taskDesciption;

    public Task() {
    }

    public Task(int id, String status, String taskDesciption) {
        this.id = id;
        this.status = status;
        this.taskDesciption = taskDesciption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTaskDesciption() {
        return taskDesciption;
    }

    public void setTaskDesciption(String taskDesciption) {
        this.taskDesciption = taskDesciption;
    }
}
