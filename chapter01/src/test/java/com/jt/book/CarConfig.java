package com.jt.book;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.PrintStream;

/**
 * @author he
 * @since 2015/2/16
 */
@Configuration
public class CarConfig {

    @Bean
    Car miniCar() {
        return new MiniCar(slowMove());
    }

    @Bean
    Move slowMove() {
        return new SlowMove(stream());
    }

    @Bean
    PrintStream stream() {
        return new FakePrintStream();
    }
}
