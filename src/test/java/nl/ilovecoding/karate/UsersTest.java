package nl.ilovecoding.karate;

import com.intuit.karate.junit5.Karate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;

@SpringBootTest(
        webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
@Slf4j
class UsersTest {

    @LocalServerPort
    private int port;

    @Karate.Test
    Karate shouldCheckRestApiForUsers() {
        log.info("Server running on port {}", port);
        return Karate.run("users").relativeTo(getClass());
    }
}
