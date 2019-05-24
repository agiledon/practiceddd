package xyz.zhangyi.practiceddd.eas.projectcontext.gateways.client;

import org.springframework.stereotype.Service;
import xyz.zhangyi.practiceddd.eas.projectcontext.interfaces.notification.NotificationService;
import xyz.zhangyi.practiceddd.eas.notificationcontext.application.NotificationAppService;
import xyz.zhangyi.practiceddd.eas.notificationcontext.domain.Message;

@Service
public class NotificationClient implements NotificationService {
    private NotificationAppService notification = new NotificationAppService();

    @Override
    public void send(String destination, String content) {
        notification.send(() -> destination, new Message(content));
    }
}
