package xyz.zhangyi.practiceddd.training.mapper;

import org.apache.ibatis.annotations.Param;

public interface WishListMapper {
    boolean exists(@Param("studentId") String studentId, @Param("courseId") String courseId);

    void insert(@Param("studentId") String studentId, @Param("courseId") String courseId);

    void delete(String studentId, String courseId);
}
