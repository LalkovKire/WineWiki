package mk.ukim.finki.winewiki.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.FOUND)
public class WineAlreadyExistsException extends RuntimeException{
    public WineAlreadyExistsException(Long id) {
         super(String.format("Wine with id: %d already exists!", id));
    }
}
