package api;

import domain.User;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public interface UsersRepository {

    User createUser (String name);

}
