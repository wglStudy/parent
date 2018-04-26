package fnw.cloud.eurekaserver8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer8080Application.class, args);
	}
}
