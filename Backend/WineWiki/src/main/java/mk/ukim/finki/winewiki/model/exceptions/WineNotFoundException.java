package mk.ukim.finki.winewiki.model.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class WineNotFoundException extends RuntimeException {
    public WineNotFoundException(Long id){
        super(String.format("Wine with id: %d was not found.",id));
    }
}
