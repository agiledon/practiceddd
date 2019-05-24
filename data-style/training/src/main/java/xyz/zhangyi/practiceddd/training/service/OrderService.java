package xyz.zhangyi.practiceddd.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import xyz.zhangyi.practiceddd.training.mapper.OrderMapper;
import xyz.zhangyi.practiceddd.training.model.Order;

@Component
@Transactional
@EnableTransactionManagement
public class OrderService {
    private OrderMapper orderMapper;

    @Autowired
    public void setOrderMapper(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public Order getOrder(String orderId) {
        Order order = orderMapper.getOrder(orderId);
        if (order == null) {
            throw new ApplicationException(String.format("Order by id %s is not found", orderId));
        }
        return order;
    }
}
