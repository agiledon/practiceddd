package top.dddclub.practiceddd.eas.notificationcontext.domain;

public class Message {
    private String subject;
    private String body;

    public Message(String body) {
        this.body = body;
    }
}
