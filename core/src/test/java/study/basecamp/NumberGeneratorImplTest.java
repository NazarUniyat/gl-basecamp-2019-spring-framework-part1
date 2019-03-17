package study.basecamp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberGeneratorImplTest {

    @Test
    void givenSmallestAndMaxNumber_whenNext_thenReturnWriteRange() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(50);
        numberGenerator.setMaxNumber(55);
        int next = numberGenerator.next();
        assertEquals(true,next>=50 && next<=55);
    }

    @Test
    void givenMaxNumber_whenGetMaxNumber_returnMaxNumber() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setMaxNumber(99);
        assertEquals(99,numberGenerator.getMaxNumber());
    }

    @Test
    void givenSmallest_whenGetSmallest_returnSmallest() {
        NumberGenerator numberGenerator = new NumberGeneratorImpl();
        numberGenerator.setSmallest(1);
        assertEquals(1,numberGenerator.getSmallest());
    }
}