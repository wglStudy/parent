package fnw.cloud.eurekaclient7070;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("fnw.cloud.eurekaclient7070.mapper")
public class EurekaClient7070Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient7070Application.class, args);
	}
}
