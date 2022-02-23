package LEO.entity.dataBase;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/5 9:51
 */
@Data
public class Person {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 信息
     */
    private String message;

}
