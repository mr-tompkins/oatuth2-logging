package configuration;

import book.controller.BookController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
public class WebBeans {

    @Bean
    public BookController bookController() {
        return new BookController();
    }
}
