INSERT INTO t_administrator(id, name, email, createdAt, updatedAt)
VALUES ('d6da80bf-4100-45c5-86c7-6ca57e0f0001', 'admin', 'admin@zhangyi.xyz', current_timestamp, current_timestamp);

INSERT INTO t_teacher(id, name, organization, title, profile, createdAt, updatedAt)
VALUES ('d6da0000-4100-45c5-86c7-6ca57e0f0001', 'Teacher A', 'BAT', 'Architect', 'Teacher A profile', current_timestamp, current_timestamp);
INSERT INTO t_teacher(id, name, organization, title, profile, createdAt, updatedAt)
VALUES ('d6da0000-4100-45c5-86c7-6ca57e0f0002', 'Teacher B', 'Apple', 'UX', 'Teacher B profile', current_timestamp, current_timestamp);
INSERT INTO t_teacher(id, name, organization, title, profile, createdAt, updatedAt)
VALUES ('d6da0000-4100-45c5-86c7-6ca57e0f0003', 'Teacher C', 'Google', 'Developer', 'Teacher C profile', current_timestamp, current_timestamp);

INSERT INTO t_category(id, name, createdAt, updatedAt)
VALUES ('ffda0000-4100-45c5-86c7-6ca57e0f0001', 'Design', current_timestamp, current_timestamp);
INSERT INTO t_category(id, name, createdAt, updatedAt)
VALUES ('ffda0000-4100-45c5-86c7-6ca57e0f0002', 'Java', current_timestamp, current_timestamp);
INSERT INTO t_category(id, name, createdAt, updatedAt)
VALUES ('ffda0000-4100-45c5-86c7-6ca57e0f0003', 'Architecture', current_timestamp, current_timestamp);

INSERT INTO t_course(id, teacherId, name, description, earning, trainee, outline, price, duration, categoryId, createdBy, createdAt, updatedAt)
VALUES ('e6da0000-4100-45c5-86c7-6ca57e0f0001', 'd6da0000-4100-45c5-86c7-6ca57e0f0001',
'DDD', 'Domain Driven Design', '通过课程掌握领域驱动设计', '各类 IT/软件企业和研发机构的软件架构师、软件设计师、程序员。',
'', 6000.00, 3, 'ffda0000-4100-45c5-86c7-6ca57e0f0001', 'd6da80bf-4100-45c5-86c7-6ca57e0f0001', current_timestamp, current_timestamp);
INSERT INTO t_course(id, teacherId, name, description, earning, trainee, outline, price, duration, categoryId, createdBy, createdAt, updatedAt)
VALUES ('e6da0000-4100-45c5-86c7-6ca57e0f0002', 'd6da0000-4100-45c5-86c7-6ca57e0f0001',
'Java Programming', 'Java programming based on open source', '通过课程掌握Java编程技巧', '各类 IT/软件企业和研发机构的软件架构师、软件设计师、程序员。',
'', 4000.00, 2, 'ffda0000-4100-45c5-86c7-6ca57e0f0002', 'd6da80bf-4100-45c5-86c7-6ca57e0f0001', current_timestamp, current_timestamp);
INSERT INTO t_course(id, teacherId, name, description, earning, trainee, outline, price, duration, categoryId, createdBy, createdAt, updatedAt)
VALUES ('e6da0000-4100-45c5-86c7-6ca57e0f0003', 'd6da0000-4100-45c5-86c7-6ca57e0f0002',
'Big Data', 'Big Data based on Spark', '通过课程掌握大数据开发知识', '各类 IT/软件企业和研发机构的软件架构师、软件设计师、程序员。',
'', 4800.00, 2, 'ffda0000-4100-45c5-86c7-6ca57e0f0003', 'd6da80bf-4100-45c5-86c7-6ca57e0f0001', current_timestamp, current_timestamp);

INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0001', 'e6da0000-4100-45c5-86c7-6ca57e0f0001', 'BeiJing',
'2019-05-08', '2019-05-10', 'Available', current_timestamp, current_timestamp);
INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0002', 'e6da0000-4100-45c5-86c7-6ca57e0f0001', 'ShangHai',
'2019-06-08', '2019-06-10', 'Available', current_timestamp, current_timestamp);
INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0003', 'e6da0000-4100-45c5-86c7-6ca57e0f0001', 'ChengDu',
'2019-07-08', '2019-07-10', 'Available', current_timestamp, current_timestamp);
INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0004', 'e6da0000-4100-45c5-86c7-6ca57e0f0002', 'BeiJing',
'2019-05-08', '2019-05-09', 'Available', current_timestamp, current_timestamp);
INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0005', 'e6da0000-4100-45c5-86c7-6ca57e0f0003', 'BeiJing',
'2019-06-08', '2019-06-09', 'Available', current_timestamp, current_timestamp);
INSERT INTO t_calendar(id, courseId, place, startDate, endDate, status, createdAt, updatedAt)
VALUES ('cada0000-4100-45c5-86c7-6ca57e0f0006', 'e6da0000-4100-45c5-86c7-6ca57e0f0003', 'XiAn',
'2019-05-05', '2019-05-06', 'Available', current_timestamp, current_timestamp);

INSERT INTO t_student(id, name, email, mobilePhone, registeredTime, createdAt, updatedAt)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0001', 'James', 'james@email.com', '13700010008', '2018-10-01', current_timestamp, current_timestamp);
INSERT INTO t_student(id, name, email, mobilePhone, registeredTime, createdAt, updatedAt)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0002', 'Tom', 'tom@email.com', '18700010008', '2018-11-01', current_timestamp, current_timestamp);
INSERT INTO t_student(id, name, email, mobilePhone, registeredTime, createdAt, updatedAt)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0003', 'Rose', 'rose@email.com', '13900010008', '2018-12-01', current_timestamp, current_timestamp);
INSERT INTO t_student(id, name, email, mobilePhone, registeredTime, createdAt, updatedAt)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0004', 'Mary', 'mary@email.com', '15000010008', '2019-01-01', current_timestamp, current_timestamp);
INSERT INTO t_student(id, name, email, mobilePhone, registeredTime, createdAt, updatedAt)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0005', 'Jack', 'jack@email.com', '18100010008', '2019-02-01', current_timestamp, current_timestamp);


INSERT INTO t_wish_list(studentId, courseId)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0001', 'e6da0000-4100-45c5-86c7-6ca57e0f0001');
INSERT INTO t_wish_list(studentId, courseId)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0001', 'e6da0000-4100-45c5-86c7-6ca57e0f0002');
INSERT INTO t_wish_list(studentId, courseId)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0001', 'e6da0000-4100-45c5-86c7-6ca57e0f0003');
INSERT INTO t_wish_list(studentId, courseId)
VALUES ('stu80000-4100-45c5-86c7-6ca57e0f0002', 'e6da0000-4100-45c5-86c7-6ca57e0f0001');

INSERT INTO t_training(id, studentId, courseId, calendarId, price, subscribedTime, createdAt, updatedAt)
VALUES ('train000-4100-45c5-86c7-6ca57e0f0001', 'stu80000-4100-45c5-86c7-6ca57e0f0001', 'e6da0000-4100-45c5-86c7-6ca57e0f0001',
'cada0000-4100-45c5-86c7-6ca57e0f0001', 5800.00, '2019-03-11 11:00:00', current_timestamp, current_timestamp);
INSERT INTO t_training(id, studentId, courseId, calendarId, price, subscribedTime, createdAt, updatedAt)
VALUES ('train000-4100-45c5-86c7-6ca57e0f0002', 'stu80000-4100-45c5-86c7-6ca57e0f0002', 'e6da0000-4100-45c5-86c7-6ca57e0f0002',
'cada0000-4100-45c5-86c7-6ca57e0f0004', 4000.00, '2019-03-19 18:00:00', current_timestamp, current_timestamp);
INSERT INTO t_training(id, studentId, courseId, calendarId, price, subscribedTime, createdAt, updatedAt)
VALUES ('train000-4100-45c5-86c7-6ca57e0f0003', 'stu80000-4100-45c5-86c7-6ca57e0f0003', 'e6da0000-4100-45c5-86c7-6ca57e0f0003',
'cada0000-4100-45c5-86c7-6ca57e0f0006', 5800.00, '2019-04-01 10:00:00', current_timestamp, current_timestamp);

INSERT INTO t_order(id, studentId, status, placedTime, createdAt, updatedAt)
VALUES ('order000-4100-45c5-86c7-6ca57e0f0001', 'stu80000-4100-45c5-86c7-6ca57e0f0001', 'New',
'2019-03-12 12:00:00', current_timestamp, current_timestamp);
INSERT INTO t_order(id, studentId, status, placedTime, createdAt, updatedAt)
VALUES ('order000-4100-45c5-86c7-6ca57e0f0002', 'stu80000-4100-45c5-86c7-6ca57e0f0002', 'New',
'2019-03-12 12:00:00', current_timestamp, current_timestamp);

INSERT INTO t_order_item(id, orderId, trainingId, createdAt, updatedAt)
VALUES ('oi11000-4100-45c5-86c7-6ca57e0f0001', 'order000-4100-45c5-86c7-6ca57e0f0001',
'train000-4100-45c5-86c7-6ca57e0f0001', current_timestamp, current_timestamp);
INSERT INTO t_order_item(id, orderId, trainingId, createdAt, updatedAt)
VALUES ('oi11000-4100-45c5-86c7-6ca57e0f0002', 'order000-4100-45c5-86c7-6ca57e0f0001',
'train000-4100-45c5-86c7-6ca57e0f0002', current_timestamp, current_timestamp);
INSERT INTO t_order_item(id, orderId, trainingId, createdAt, updatedAt)
VALUES ('oi11000-4100-45c5-86c7-6ca57e0f0003', 'order000-4100-45c5-86c7-6ca57e0f0002',
'train000-4100-45c5-86c7-6ca57e0f0003', current_timestamp, current_timestamp);