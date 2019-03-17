package study.basecamp;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;


@Getter
@Setter
public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    private int smallest;
    private int maxNumber;


    @Autowired
    public void setSmallest(int smallest) {
        this.smallest = smallest;
    }

    @Autowired
    public void setMaxNumber(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    @Override
    public int next() {
        return random.nextInt(maxNumber - smallest + 1) + smallest;
    }

}
