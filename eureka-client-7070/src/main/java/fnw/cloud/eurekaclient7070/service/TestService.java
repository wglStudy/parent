package fnw.cloud.eurekaclient7070.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import fnw.cloud.eurekaclient7070.entity.Entity;
import fnw.cloud.eurekaclient7070.mapper.TestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: wu_guang_lu@163.com
 * @date: 2018/4/22 21:58
 * @Description:
 */
@Service
public class TestService extends ServiceImpl<TestMapper,Entity>{

    @Autowired
    private TestMapper testMapper;

}
