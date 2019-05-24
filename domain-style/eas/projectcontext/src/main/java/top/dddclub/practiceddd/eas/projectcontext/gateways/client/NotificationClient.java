package top.dddclub.practiceddd.eas.projectcontext.gateways.client;

import org.springframework.stereotype.Service;
import top.dddclub.practiceddd.eas.notificationcontext.application.NotificationAppService;
import top.dddclub.practiceddd.eas.notificationcontext.domain.Message;
import top.dddclub.practiceddd.eas.projectcontext.interfaces.notification.NotificationService;

@Service
public class NotificationClient implements NotificationService {
    private NotificationAppService notification = new NotificationAppService();

    @Override
    public void send(String destination, String content) {
        notification.send(() -> destination, new Message(content));
    }
}
