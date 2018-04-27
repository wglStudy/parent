package fnw.cloud.ribbon6060;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @Package:        fnw.cloud.ribbon6060
 * @Author:         wgl
 * @CreateDate:     2018/4/27 0027 13:41
 * @UpdateDate:     2018/4/27 0027 13:41
 * @Version:        1.0
 * @Description:
 */
/**
 * 注册成为eureka的客户端,获取服务发现的能力
 */
@EnableDiscoveryClient
/**
 *使用该注解开启断路器功能
 */
@EnableCircuitBreaker
@SpringBootApplication
public class Ribbon6060Application {

	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
		return new RestTemplate();
	}

	public static void main(String[] args) {
		SpringApplication.run(Ribbon6060Application.class, args);
	}
}
