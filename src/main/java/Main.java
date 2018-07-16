import api.Logger;
import api.UsersRepository;
import implementations.LoggerImpl;
import implementations.UsersRepositoryImpl;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class Main {
    public static void main(String[] args) {

        Logger logger = new LoggerImpl();
        UsersRepository usersRepository = new UsersRepositoryImpl();

        usersRepository.setLogger(logger);
        usersRepository.createUser("Tomasz");


    }
}
