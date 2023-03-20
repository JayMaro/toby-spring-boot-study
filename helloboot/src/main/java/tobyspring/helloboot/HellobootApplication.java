package tobyspring.helloboot;


import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import tobyspring.config.MySpringBootApplication;

@MySpringBootApplication
public class HellobootApplication {

//	/**
//	 * 우선 순위
//	 * 1. SystemProperty(VM Option)
//	 * 2. EnvironmentVariable
//	 * 3. application.properties(yml)
//	 *
//	 * @param env
//	 * @return
//	 */
//	@Bean
//	ApplicationRunner applicationRunner(Environment env) {
//		return args -> {
//			String name = env.getProperty("my.name");
//			System.out.println("name = " + name);
//		};
//	}

	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}
}
