package app;

public class NameNotFoundException extends RuntimeException{
    NameNotFoundException(Long id) {
        super("Could not find this Name " + id);
    }
}
