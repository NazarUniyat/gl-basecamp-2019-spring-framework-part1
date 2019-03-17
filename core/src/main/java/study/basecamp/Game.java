package study.basecamp;

public interface Game {

    int getNumber();

    int getGuess();

    void setGuess(int guess);

    void setSmallest(int i);

    void setBiggest(int biggest);

    void setNumber(int number);

    void setNumberGenerator(NumberGenerator numberGenerator);

    void setGuessCount(int guessCount);

    void setRemainingGuesses(int remainingGuesses);

    int getSmallest();

    int getBiggest();

    int getRemainingGuesses();

    void reset();

    void check();

    boolean isValidNumberRange();

    boolean isGameWon();

//    boolean isGameLost();

}
