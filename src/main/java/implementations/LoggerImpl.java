package implementations;

import api.Logger;

import java.util.Date;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class LoggerImpl implements Logger {
    private String name;
    private int version;


    public void log (String message){

        System.out.println(new Date() + " [" + name + " vers." + version + "]: " + message);
    }

    public void setName(String name) {
        this.name= name;


    }

    public void setVersion(int version) {
        this.version=version;

    }
}
