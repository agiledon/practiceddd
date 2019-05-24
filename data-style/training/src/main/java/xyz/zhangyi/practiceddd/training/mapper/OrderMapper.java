package xyz.zhangyi.practiceddd.training.mapper;

import org.apache.ibatis.annotations.Param;
import xyz.zhangyi.practiceddd.training.model.Order;

public interface OrderMapper {
    Order getOrder(@Param("orderId") String orderId);
}
