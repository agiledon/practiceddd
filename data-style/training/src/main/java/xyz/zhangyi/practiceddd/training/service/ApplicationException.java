package xyz.zhangyi.practiceddd.training.service;

public class ApplicationException extends RuntimeException {
    public ApplicationException(String message) {
        super(message);
    }

    public ApplicationException(Exception ex) {
        super(ex);
    }
}
