package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Training {
    private String id;
    private Student student;
    private Course course;
    private Calendar calendar;
    private double price;
    private Timestamp subscribedTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
