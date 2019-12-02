package pl.kandif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "pl.kandif")
public class Config {
    private static ApplicationContext applicationContext;

    public static void main(String[] args) {
        applicationContext =
                new AnnotationConfigApplicationContext(Config.class);

        for (String beanName : applicationContext.getBeanDefinitionNames()) {
            System.out.println(beanName);
        }
    }
}