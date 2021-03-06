package ru.geen.test.examplewar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

/**
 * Created by geen on 02.04.17.
 */
@SpringBootApplication
public class MainApplication extends SpringBootServletInitializer
{
    public static void main(String... args)
    {
        SpringApplication.run(MainApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder)
    {
        return builder.sources(MainApplication.class);
    }
}
