/**
 * simple class for exception handling
 * @author mohamed
 */
public class InvalidAccountException extends Exception{

    /**
     * display error message.
     */
    private static final String MSG ="The Chequing Account object is not valid!";

    /**
     * constructor for error message.
     */
    public InvalidAccountException() {super(MSG);
    }

//    public InvalidAccountException(String message) {
//        super(message);
//    }
//
//    public InvalidAccountException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public InvalidAccountException(Throwable cause) {
//        super(cause);
//    }
}
