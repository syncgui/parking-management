package syncgui.parkingmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException() {
        super("Records for this ID not found!");
    }

    public ResourceNotFoundException(String ex) {
        super(ex);
    }
}
