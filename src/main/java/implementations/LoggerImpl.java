package implementations;

import api.Logger;

import java.util.Date;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class LoggerImpl implements Logger {

    public void log (String message){

        System.out.println(new Date() + ":" + message);
    }
}
