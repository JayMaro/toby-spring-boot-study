package tobyspring.helloboot;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

@HelloBootTest
class HelloRepositoryTest {

    @Autowired
    HelloRepository helloRepository;
    @Autowired
    JdbcTemplate jdbcTemplate;

    @Test
    void findHelloFailed() {
        Assertions.assertThat(helloRepository.findHello("Maro")).isNull();
        Assertions.assertThat(helloRepository.countOf("Maro")).isEqualTo(0);
    }

    @Test
    void increaseCount() {
        helloRepository.increaseCount("Maro");
        Assertions.assertThat(helloRepository.countOf("Maro")).isEqualTo(1);

        helloRepository.increaseCount("Maro");
        Assertions.assertThat(helloRepository.countOf("Maro")).isEqualTo(2);
    }
}