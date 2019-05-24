package xyz.zhangyi.practiceddd.eas.projectcontext.domain.exception;

public class InvalidBacklogException extends RuntimeException {
    public InvalidBacklogException() {
    }

    public InvalidBacklogException(String message) {
        super(message);
    }

    public InvalidBacklogException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidBacklogException(Throwable cause) {
        super(cause);
    }
}
