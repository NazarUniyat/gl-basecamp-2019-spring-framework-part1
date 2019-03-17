package study.basecamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class GameImplTest {

    @Test
    void givenInstanceOfGame_whenReset_thanReturnResetedObject() {
        Game game = new GameImpl();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(4);
        numberGenerator.setMaxNumber(4);
        int next = numberGenerator.next();
        game.setNumberGenerator(numberGenerator);

        game.setSmallest(numberGenerator.getSmallest());
        game.setGuessCount(12);
        game.setGuess(10);
        game.setBiggest(numberGenerator.getMaxNumber());
        game.setNumber(next);

        game.reset();
        assertEquals(0, game.getGuess());
        assertEquals(4, game.getSmallest());
        assertEquals(4, game.getBiggest());
        assertEquals(4, game.getNumber());
        assertEquals(12, game.getRemainingGuesses());
    }

    @Test
    void givenInstanceOfGame_whenCheck_thanReturnDecrementedGuessCount() {
        Game game = new GameImpl();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(4);
        numberGenerator.setMaxNumber(4);
        int next = numberGenerator.next();
        game.setNumberGenerator(numberGenerator);

        game.setSmallest(numberGenerator.getSmallest());
        game.setRemainingGuesses(10);
        game.setGuess(12);
        game.setBiggest(numberGenerator.getMaxNumber());
        game.setNumber(next);

        game.check();
        assertEquals(9, game.getRemainingGuesses());
    }

    @Test
    void givenInstanceOfGame_whenCheck_thanReturnDecrementedBiggestRangeValue() {
        Game game = new GameImpl();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(4);
        numberGenerator.setMaxNumber(4);
        int next = numberGenerator.next();
        game.setNumberGenerator(numberGenerator);

        game.setSmallest(0);
        game.setBiggest(20);
        game.setRemainingGuesses(10);
        game.setGuess(13);
        game.setNumber(next);


        game.check();

        assertEquals(12, game.getBiggest());
    }

    @Test
    void givenInstanceOfGame_whenCheck_thanReturnIncrementedSmallestRangeValue() {
        Game game = new GameImpl();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(4);
        numberGenerator.setMaxNumber(4);
        int next = numberGenerator.next();
        game.setNumberGenerator(numberGenerator);

        game.setSmallest(0);
        game.setBiggest(20);
        game.setRemainingGuesses(10);
        game.setGuess(2);
        game.setNumber(next);


        game.check();

        assertEquals(3, game.getSmallest());
    }


    @Test
    void isGameWon() {
        Game game = new GameImpl();
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(4);
        numberGenerator.setMaxNumber(4);
        int next = numberGenerator.next();
        game.setNumberGenerator(numberGenerator);

        game.setSmallest(0);
        game.setBiggest(20);
        game.setRemainingGuesses(10);
        game.setGuess(4);
        game.setNumber(next);

        assertEquals(true, game.isGameWon());

    }

    @Test
    void givenInvalidNumberRange_whenCheckValidNumberRange_thenReturnTrue(){
        Game game = new GameImpl();

        game.setSmallest(0);
        game.setBiggest(20);
        game.setRemainingGuesses(1);
        game.setGuess(21);
        game.setNumber(15);

        game.check();

        assertNotEquals(true,game.isValidNumberRange());
    }

}