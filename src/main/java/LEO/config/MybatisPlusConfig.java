package LEO.config;

import com.baomidou.mybatisplus.core.MybatisConfiguration;
import com.baomidou.mybatisplus.core.parser.ISqlParser;
import com.baomidou.mybatisplus.extension.parsers.BlockAttackSqlParser;
import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import com.zaxxer.hikari.HikariDataSource;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.logging.stdout.StdOutImpl;
import org.apache.ibatis.plugin.Interceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description: MybatisPlus配置
 * @Author: xushen
 * @Date: 2022/1/18
 */
@Slf4j
@EnableTransactionManagement
@Configuration
@MapperScan({"LEO.dao"})
public class MybatisPlusConfig {

    @Value("${mybatis.configuration.log-impl}")
    private String mybatisLogImpl;

    @Value("${datasource.url}")
    private String jdbcUrl;

    @Value("${datasource.username}")
    private String username;

    @Value("${datasource.password}")
    private String password;

    @Bean("master")
    @Primary
    public DataSource master() {
        //默认连接配置文件数据库
        HikariDataSource dataSource = new HikariDataSource();
        try {
            dataSource.setJdbcUrl(jdbcUrl);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setDriverClassName("com.mysql.jdbc.Driver");
            dataSource.setConnectionTestQuery("SELECT 1");
            dataSource.setIdleTimeout(30000);
            dataSource.setMaxLifetime(1880000);
            dataSource.setConnectionTimeout(30000);
            dataSource.setMinimumIdle(5);
            dataSource.setValidationTimeout(60000);
        } catch (Exception e) {
            log.error(">>>>默认连接配置文件数据库异常："+e);
        }
        return dataSource;
    }
}
