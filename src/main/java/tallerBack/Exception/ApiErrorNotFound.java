package tallerBack.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ApiErrorNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ApiErrorNotFound() {
        super();
    }

    public ApiErrorNotFound(String message) {
        super(message);
    }

    public ApiErrorNotFound(String message, Throwable cause) {
        super(message, cause);
    }

}
