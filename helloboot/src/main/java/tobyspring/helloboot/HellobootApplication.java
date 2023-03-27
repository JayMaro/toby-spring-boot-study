package tobyspring.helloboot;


import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
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

	private final JdbcTemplate jdbcTemplate;

	public HellobootApplication(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@PostConstruct
	void init() {
		jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS hello(name varchar(50) primary key , count int)");
	}

	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}
}
