package LEO.dao;

import LEO.entity.dataBase.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/18 11:32
 */
public interface FirstDao {

    /**
     * 第一条测试数据
     * @return
     */
    List<Person> getListInfo();

    /**
     * 用于获取动态生成id
     * @param list
     */
    Integer insertInfo(@Param("list") List<Person> list);
}
