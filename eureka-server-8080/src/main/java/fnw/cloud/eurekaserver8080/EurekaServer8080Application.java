package fnw.cloud.eurekaserver8080;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @Package:        fnw.cloud.eurekaserver8080
 * @Author:         wgl
 * @CreateDate:     2018/4/27 0027 13:41
 * @UpdateDate:     2018/4/27 0027 13:41
 * @Version:        1.0
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8080Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer8080Application.class, args);
	}
}
