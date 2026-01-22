package _10_exceptions;

//checked exception
public class InvalidEmailException extends Exception {
    InvalidEmailException() {
    }

    InvalidEmailException(String message) {
        super(message);
    }
}
