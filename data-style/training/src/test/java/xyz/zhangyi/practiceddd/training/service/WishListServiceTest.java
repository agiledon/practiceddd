package xyz.zhangyi.practiceddd.training.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/spring-config.xml")
public class WishListServiceTest {
    @Resource
    private WishListService wishListService;

    @Test
    public void should_not_exist_in_wish_list() {
        String studentId = "stu80000-4100-45c5-86c7-6ca57e0f0001";
        String courseId = "e6da0000-4100-45c5-86c7-6ca57e0f0001";

        String expectedMessage = String.format("course with id %s is existed.", courseId);

        assertThatThrownBy(() -> wishListService.add(studentId, courseId)).hasMessage(expectedMessage);

    }
}