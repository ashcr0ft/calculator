package pro.sky.calculator.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class DivisionException extends IllegalArgumentException {

    public DivisionException() {
    }

    public DivisionException(String message) {
        super(message);
    }
}
