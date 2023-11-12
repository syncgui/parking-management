package syncgui.parkingmanagement.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NoParkingSpacesException extends RuntimeException {
    public NoParkingSpacesException() {
        super("This parking lot has no spaces!");
    }

    public NoParkingSpacesException(String ex) {
        super(ex);
    }
}
