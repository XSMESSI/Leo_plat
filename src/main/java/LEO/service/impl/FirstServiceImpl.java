package LEO.service.impl;

import LEO.dao.FirstDao;
import LEO.entity.dataBase.Person;
import LEO.service.FirstService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/18 11:42
 */
@Service
public class FirstServiceImpl implements FirstService {


    @Resource
    private FirstDao firstDao;

    @Override
    public List<Person> listInfo() {
        List<Person> list = firstDao.getListInfo();
        return list;
    }

    @Override
    public Integer count() {
        Integer num1 = 1;
        Integer num2 = 2;
        return num1+num2;
    }
}
