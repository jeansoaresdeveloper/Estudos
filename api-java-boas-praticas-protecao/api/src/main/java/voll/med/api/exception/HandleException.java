package voll.med.api.exception;

import jakarta.persistence.EntityNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.List;

@RestControllerAdvice
public class HandleException {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity handleExceptionNotFound() {
        return ResponseEntity.notFound().build();
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity handleExceptionMethodArgumentNotValid(MethodArgumentNotValidException exception) {
        List<FieldError> errors = exception.getFieldErrors();
        return ResponseEntity.badRequest().body(errors.stream().map(DataErrorValidation::new).toList());
    }

    private record DataErrorValidation(String field, String message) {
        public DataErrorValidation(FieldError error) {
            this(error.getField(), error.getDefaultMessage());
        }
    }
}
