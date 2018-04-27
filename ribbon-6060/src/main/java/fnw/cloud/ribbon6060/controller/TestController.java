package fnw.cloud.ribbon6060.controller;

import fnw.cloud.ribbon6060.entity.Entity;
import fnw.cloud.ribbon6060.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ProjectName: parent
 * @Package: fnw.cloud.ribbon6060.controller
 * @ClassName: ${TYPE_NAME}
 * @Author: wgl
 * @CreateDate: 2018/4/27 0027 14:32
 * @UpdateDate: 2018/4/27 0027 14:32
 * @Version: 1.0
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Entity> get(){
        return testService.get();
    }



    @RequestMapping(value = "/demo",method = RequestMethod.GET)
    public List<Entity> demo() throws InterruptedException {
        return testService.hystrix();
    }
}
