package practiceddd.eas.projectcontext.domain.exception;

public class InvalidAssignmentException extends RuntimeException {
    public InvalidAssignmentException() {
    }

    public InvalidAssignmentException(String message) {
        super(message);
    }

    public InvalidAssignmentException(String message, Throwable cause) {
        super(message, cause);
    }

    public InvalidAssignmentException(Throwable cause) {
        super(cause);
    }
}
