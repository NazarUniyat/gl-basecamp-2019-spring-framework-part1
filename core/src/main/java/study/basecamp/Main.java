package study.basecamp;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static Logger log = LogManager.getLogger(Main.class);



    public static void main(String[] args) {
        log.info("Guess Number");
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("Configuration");
        Game game = context.getBean(Game.class);
        GameStarter.startGame(game);
        context.close();


    }
}
