package fnw.cloud.eurekaclient7070;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
/**
 * @Package:        fnw.cloud.eurekaclient7070
 * @Author:         wgl
 * @CreateDate:     2018/4/27 0027 13:42
 * @UpdateDate:     2018/4/27 0027 13:42
 * @Version:        1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("fnw.cloud.eurekaclient7070.mapper")
public class EurekaClient7070Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient7070Application.class, args);
	}
}
