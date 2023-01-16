package uia.com.apimvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "uia.com.apimvc")
@Import({AppMvcConfig.class})
@EnableAutoConfiguration
public class ApiMvcApplication extends SpringBootServletInitializer {
	private static final Class applicationClass = ApiMvcApplication.class;

	public static void main(String[] args) {
		SpringApplication.run(ApiMvcApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(applicationClass);
	}
}
