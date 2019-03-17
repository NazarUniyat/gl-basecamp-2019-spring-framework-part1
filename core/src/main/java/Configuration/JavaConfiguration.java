package Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import study.basecamp.GameImpl;
import study.basecamp.NumberGeneratorImpl;

@Configuration
@ComponentScan(basePackages = "study.basecamp")
public class JavaConfiguration {

    @Bean
    public NumberGeneratorImpl numberGenerator(){
        return new NumberGeneratorImpl();
    }


    @Bean("game")
    public GameImpl getGame(){
        GameImpl game = new GameImpl();
        return game;
    }
}
