package ru.nurullin.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public SpongeBob spongeBob() {
        return new SpongeBob();
    }

    @Bean
    public Patrik patrik() {
        return new Patrik();
    }

    @Bean
    public Squidward squidward() {
        return new Squidward();
    }

    @Bean
    public Spisok spisok() {
        return new Spisok(spongeBob(), patrik(), squidward());
    }
}
