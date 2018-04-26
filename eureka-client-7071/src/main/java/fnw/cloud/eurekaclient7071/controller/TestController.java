package fnw.cloud.eurekaclient7071.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import fnw.cloud.eurekaclient7071.entity.Entity;
import fnw.cloud.eurekaclient7071.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: wu_guang_lu@163.com
 * @date: 2018/4/22 17:07
 * @Description:
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public List<Entity> get(){
        EntityWrapper<Entity> p = new EntityWrapper<Entity>();
        p.eq("device_type","UES");
        return  testService.selectList(p);
    }
}
