package Configuration;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "study.basecamp")
@PropertySource("classpath:game.properties")
public class GameConfig {

    @Value("${max.number}")
    private int maxNumber;
    @Value("${guess.count}")
    private int guessCount;
    @Value("${min.number}")
    private int minNumber;


    @Bean
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    public int guessCount() {
        return guessCount;
    }

    @Bean("smallest")
    public int minNumber() {
        return minNumber;
    }

}
