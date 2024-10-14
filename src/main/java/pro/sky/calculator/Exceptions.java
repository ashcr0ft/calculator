package pro.sky.calculator;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@ControllerAdvice
@RestController
public class Exceptions extends RuntimeException {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> incorrectParameter(IllegalArgumentException e) {
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
