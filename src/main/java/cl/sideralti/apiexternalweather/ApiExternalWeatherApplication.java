package cl.sideralti.apiexternalweather;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
//@ComponentScan({"cl.sideralti.apiexternalweather"})
//@EntityScan("cl.sideralti.apiexternalweather.domain")
//@EnableJpaRepositories //("cl.sideralti.apiexternalweather.infrastructure.repositories")
public class ApiExternalWeatherApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(ApiExternalWeatherApplication.class, args);
	}

}
