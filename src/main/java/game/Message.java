/**
 * <h1>Message class!</h1>
 * Message structure used for communication between Players
 *
 * @author  Farrukh Gafurov
 * @version 1.0
 * @since   2019-05-12
 */
package game;

public class Message {

    private String message;
    private Integer counter;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
