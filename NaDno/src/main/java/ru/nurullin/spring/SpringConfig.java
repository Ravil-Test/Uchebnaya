package ru.nurullin.spring;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ru.nurullin.spring")
public class SpringConfig {
    @Bean
    public Kefir1 kefir1() {
        return new Kefir1();
    }

    @Bean
    public Moloko32 moloko32() {
        return new Moloko32();
    }

    @Bean
    public Tvorog5 tvorog5() {
        return new Tvorog5();
    }

    @Bean
    public Kokos kokos() {
        return new Kokos();
    }

    @Bean
    public Palmovoe palmovoe() {
        return new Palmovoe();
    }

    @Bean
    public Podsolnuh podsolnuh() {
        return new Podsolnuh();
    }

    @Bean
    public Holodilnik holodilnik() {
        return new Holodilnik();
    }
}
