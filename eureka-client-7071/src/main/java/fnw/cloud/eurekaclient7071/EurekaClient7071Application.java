package fnw.cloud.eurekaclient7071;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Package:        fnw.cloud.eurekaclient7071
 * @Author:         wgl
 * @CreateDate:     2018/4/27 0027 13:41
 * @UpdateDate:     2018/4/27 0027 13:41
 * @Version:        1.0
 * @Description:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("fnw.cloud.eurekaclient7071.mapper")
public class EurekaClient7071Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClient7071Application.class, args);
	}
}
