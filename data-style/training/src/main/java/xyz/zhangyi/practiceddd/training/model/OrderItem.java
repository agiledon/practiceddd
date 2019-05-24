package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class OrderItem {
    private String id;
    private String orderId;
    private Training training;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
