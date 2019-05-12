/**
 * <h1>Not enough players exception!</h1>
 * Custom Exception class for handing not enough players exception.
 *
 * @author  Farrukh Gafurov
 * @version 1.0
 * @since   2019-05-12
 */
package exception;

public class NotEnoughPlayersException extends Exception {

    public NotEnoughPlayersException(String message) {
        super(message);
    }
}
