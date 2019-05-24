package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Student {
    private String id;
    private String name;
    private String email;
    private String mobilePhone;
    private Timestamp registeredTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
