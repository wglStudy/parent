package fnw.cloud.ribbon6060.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import fnw.cloud.ribbon6060.entity.Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: parent
 * @Package: fnw.cloud.ribbon6060.service
 * @ClassName: ${TYPE_NAME}
 * @Author: wgl
 * @CreateDate: 2018/4/27 0027 14:33
 * @UpdateDate: 2018/4/27 0027 14:33
 * @Version: 1.0
 * @Description:
 */
@Service
public class TestService {

        @Autowired
        private RestTemplate restTemplate;

        public List<Entity> get(){
            List body = restTemplate.getForEntity("http://eureka-client-7070/get", List.class).getBody();
            System.out.print(body);
            return body;

        }


        @HystrixCommand(fallbackMethod = "back")
        public List<Entity> hystrix() throws InterruptedException {
            List body = restTemplate.getForEntity("http://eureka-client-7070/get", List.class).getBody();
            Thread.sleep(50000);
            System.out.print(body);
            return body;

        }


        public List<Entity> back(){
            Entity entity = new Entity();
            entity.setAlias("error");
            List<Entity> list = new ArrayList<Entity>();
            list.add(entity);
            return  list;
        }
}
