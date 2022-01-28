package LEO;

import LEO.entity.dataBase.Person;
import LEO.service.FirstService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Description
 * @Author XuShen
 * @Date 2022/1/18 11:46
 */
@SpringBootTest
public class test {

    @Resource
    private FirstService firstService;

    @Test
    public void test(){
        List<Person> list = firstService.listInfo();
        System.out.println("list = " + list);

        System.out.println(">>>>>>>>");
        System.out.println(firstService.count());
    }
}
