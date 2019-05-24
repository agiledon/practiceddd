package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Payment {
    private String id;
    private String studentId;
    private String orderId;
    private double amount;
    private String paymentStyle;
    private PaymentStatus status;
    private Timestamp transactionTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
