package LEO.service;

import LEO.entity.dataBase.Person;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/18 11:41
 */
public interface FirstService {

    /**
     * 第一条测试数据
     * @return
     */
    List<Person> listInfo();

    Integer count();

}
