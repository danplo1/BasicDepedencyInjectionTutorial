package domain;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class User {

    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public User(String name) {
        this.name = name;
    }
}
