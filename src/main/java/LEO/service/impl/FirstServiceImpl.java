package LEO.service.impl;

import LEO.dao.FirstDao;
import LEO.entity.dataBase.Person;
import LEO.service.FirstService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
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
    public void insertInfo() {
        List<Person> list  = new ArrayList<>();
        Person param = new Person();
        param.setMessage("利物浦球员");
        param.setAge(30);
        param.setName("萨拉赫");

        Person param1 = new Person();
        param1.setMessage("拜仁球员");
        param1.setAge(35);
        param1.setName("莱万");
        list.add(param);
        list.add(param1);
        Integer num = firstDao.insertInfo(list);
        //插入数据的行数
        System.out.println("插入数据的条数num = " + num);
        List<Integer> ids = new ArrayList<>();
        ids.add(param.getId());
        ids.add(param1.getId());
        //自动生成的id值输出
        System.out.println("generated value = " + ids);
    }

    @Override
    public Integer count() {
        Integer num1 = 1;
        Integer num2 = 2;
        return num1+num2;
    }
}
