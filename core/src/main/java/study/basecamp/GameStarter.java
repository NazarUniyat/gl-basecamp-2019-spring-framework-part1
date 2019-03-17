package study.basecamp;

import Utils.ReadFromConsole;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class GameStarter {

    private static Logger log = LogManager.getLogger(GameStarter.class);



    public static void startGame(Game game) {
        int startGame = 1;
        while (startGame == 1) {
            log.info("you should input number between {} and {}", game.getSmallest(), game.getBiggest());
            log.info("you have {} attempts",game.getRemainingGuesses());
            do {
                int guess = ReadFromConsole.read();
                game.setGuess(guess);
                log.info("My guess = {}", guess);
                game.check();
                log.info("you should input number between {} and {}", game.getSmallest(), game.getBiggest());
                log.info("Result = {}", game.isGameWon() ? "Win" : "Lose");
                log.info("count of attempts = {}", game.getRemainingGuesses());
            } while (game.getRemainingGuesses() != 0 && !game.isGameWon());
            log.info("1 - to continue, 0 - stop");
            startGame = ReadFromConsole.read();
            if (startGame == 1) {
                game.reset();
            } else log.info("have a good day)");
        }
    }
}
