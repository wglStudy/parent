package fnw.cloud.eurekaserver8081;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * @Package:        fnw.cloud.eurekaserver8081
 * @Author:         wgl
 * @CreateDate:     2018/4/27 0027 13:41
 * @UpdateDate:     2018/4/27 0027 13:41
 * @Version:        1.0
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServer8081Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer8081Application.class, args);
	}
}
