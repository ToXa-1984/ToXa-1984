package Lesson14;

import java.io.IOException;

public class CustomException extends IOException {

    public CustomException() {
        super();
    }

    public CustomException(String message) {
        super(message);
    }
}