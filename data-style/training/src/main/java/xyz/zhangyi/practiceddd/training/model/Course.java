package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Course {
    private String id;
    private Teacher teacher;
    private String name;
    private String description;
    private String earning;
    private String trainee;
    private String outline;
    private double price;
    private int duration;
    private Category category;
    private Administrator createdBy;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
