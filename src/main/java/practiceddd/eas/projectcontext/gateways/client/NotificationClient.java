package practiceddd.eas.projectcontext.gateways.client;

import practiceddd.eas.notificationcontext.application.NotificationAppService;
import practiceddd.eas.notificationcontext.domain.Message;
import practiceddd.eas.projectcontext.interfaces.notification.NotificationService;

public class NotificationClient implements NotificationService {
    private NotificationAppService notification = new NotificationAppService();

    @Override
    public void send(String destination, String content) {
        notification.send(() -> destination, new Message(content));
    }
}
