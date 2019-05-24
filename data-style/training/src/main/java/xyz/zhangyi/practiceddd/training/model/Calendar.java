package xyz.zhangyi.practiceddd.training.model;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

@Data
public class Calendar {
    private String id;
    private int courseId;
    private String place;
    private Date startDate;
    private Date endDate;
    private CalendarStatus status;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
