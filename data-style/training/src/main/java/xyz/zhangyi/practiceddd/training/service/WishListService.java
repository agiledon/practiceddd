package xyz.zhangyi.practiceddd.training.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import xyz.zhangyi.practiceddd.training.mapper.WishListMapper;

@Component
@Transactional
@EnableTransactionManagement
public class WishListService {
    private WishListMapper wishListMapper;

    @Autowired
    public void setWishListMapper(WishListMapper wishListMapper) {
        this.wishListMapper = wishListMapper;
    }

    public void add(String studentId, String courseId) {
        if (wishListMapper.exists(studentId, courseId)) {
            throw new ApplicationException(String.format("course with id %s is existed.", courseId));
        }
        wishListMapper.insert(studentId, courseId);
    }
}
