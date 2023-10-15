package mk.ukim.finki.winewiki.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class ManufacturerAlreadyExistsException extends RuntimeException{
    public ManufacturerAlreadyExistsException(Long id) {
        super(String.format("The manufacturer with id: %d already exists!",id));
    }
}
