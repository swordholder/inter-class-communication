/**
 * <h1>Utils class!</h1>
 * Some utility methods may take place here
 *
 * @author  Farrukh Gafurov
 * @version 1.0
 * @since   2019-05-12
 */
package utils;

import java.util.Random;

public class Utils {

    public static Integer getRandom(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;

    }
}
