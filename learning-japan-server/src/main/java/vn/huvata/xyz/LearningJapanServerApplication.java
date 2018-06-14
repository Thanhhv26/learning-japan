package vn.huvata.xyz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author van-thanh
 *
 */
@SpringBootApplication
@ComponentScan({"vn.huvata.xyz"})
@EntityScan("vn.huvata.xyz.domain")
@EnableJpaRepositories("vn.huvata.xyz.repository")
public class LearningJapanServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearningJapanServerApplication.class, args);
	}
}
