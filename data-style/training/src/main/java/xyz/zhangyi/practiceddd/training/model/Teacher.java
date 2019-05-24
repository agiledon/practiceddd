package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Teacher {
    private String id;
    private String name;
    private String organization;
    private String title;
    private String profile;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
