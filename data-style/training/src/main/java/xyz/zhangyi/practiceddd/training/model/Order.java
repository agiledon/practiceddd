package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;
import java.util.UUID;

@Data
public class Order {
    private String id;
    private Student student;
    private OrderStatus status;
    private Timestamp placedTime;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private List<OrderItem> orderItems;

    public Order() {
        this.id = UUID.randomUUID().toString();
    }

    public Order(String orderId) {
        this.id = orderId;
    }
}
