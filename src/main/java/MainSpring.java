import api.UsersRepository;
import domain.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Daniel_D'AGE on 16.07.2018.
 */
public class MainSpring {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("configuration");

        UsersRepository usersRepository = context.getBean("UsersRepository", UsersRepository.class);

        User Tomasz = usersRepository.createUser("Tomasz");


    }
}
