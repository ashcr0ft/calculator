package pro.sky.calculator.Exeptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class ParameterNotFoundException extends RuntimeException {

    public ParameterNotFoundException() {
    }

    public ParameterNotFoundException(String message) {
        super(message);
    }
}