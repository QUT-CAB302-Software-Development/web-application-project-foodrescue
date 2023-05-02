package example.data.Exceptions;

/**
 * Invalid Review Exception provides custom a exception specifically for when invalid reviews are found.
 */
public class InvalidReviewException extends Exception {
    public InvalidReviewException(String message) {
        super(message);
    }
}
