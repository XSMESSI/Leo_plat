package LEO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.scheduling.annotation.EnableScheduling;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication(exclude={SecurityAutoConfiguration.class})
@EnableSwagger2
@EnableScheduling
public class LeoRunApplication {
	public static void main(String[] args) {
		SpringApplication.run(LeoRunApplication.class, args);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>" +
                ">>>LEO>>>>>>>>>>>>>>>>START>>>>>>>>>>>>>>>>>>>>>SUCESS>>>>>>>>>>" +
                ">>>>>>>>>>>>>>>>>>>>>>>>");
	}

}
