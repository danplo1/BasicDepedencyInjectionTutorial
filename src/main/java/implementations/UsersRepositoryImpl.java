package implementations;

import api.Logger;
import api.UsersRepository;
import domain.User;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class UsersRepositoryImpl implements UsersRepository{
    private Logger logger;

    public UsersRepositoryImpl(Logger logger, String location, String dbName){
        this.logger =logger; //konstruktor
        logger.log("Lokalizacja repozytorium " + location + "/" + dbName);
    }



    public User createUser (String name){
        logger. log("Tworzenie użytkownika: " + name);
        return new User(name);
    }



}
