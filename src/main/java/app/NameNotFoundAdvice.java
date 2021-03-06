package app;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class NameNotFoundAdvice {
    @ResponseBody
    @ExceptionHandler(NameNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String nameNotFoundHandler(NameNotFoundException ex) {
        return ex.getMessage();
    }
}
