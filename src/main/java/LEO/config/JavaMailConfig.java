package LEO.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import java.util.Properties;

/**
 * @Description 邮箱发送消息配置文件
 * @Author XuShen
 * @Date 2022/1/7 15:32
 */
@Configuration
public class JavaMailConfig {

    @Value("${mail.smtp.host}")
    private String host;

    @Value("${mail.smtp.username}")
    private String username;

    @Value("${mail.smtp.password}")
    private String password;

    @Value("${mail.smtp.protocol}")
    private String protocol;

    @Value("${mail.smtp.port}")
    private int port;

    @Value("${mail.smtp.defaultEncoding}")
    private String defaultEncoding;

    @Value("${mail.smtp.auth}")
    private Boolean auth;

    @Value("${mail.smtp.timeout}")
    private int timeout;

    @Value("${mail.smtp.socketFactory.port}")
    private int socketFactoryPort;

    @Value("${mail.smtp.socketFactory.class}")
    private String socketFactoryClass;

    @Bean("mailSender")
    public JavaMailSenderImpl configJavaMailSender(){
        JavaMailSenderImpl javaMailSender = new JavaMailSenderImpl();
        javaMailSender.setHost(host);
        javaMailSender.setUsername(username);
        javaMailSender.setPassword(password);
        javaMailSender.setProtocol(protocol);
        javaMailSender.setPort(port);
        javaMailSender.setDefaultEncoding(defaultEncoding);

        Properties properties = new Properties();
        properties.put("mail.smtp.auth","true");
        properties.put("mail.smtp.timeout",timeout);
        properties.put("mail.smtp.socketFactory.port",socketFactoryPort);
        properties.put("mail.smtp.socketFactory.class",socketFactoryClass);
        javaMailSender.setJavaMailProperties(properties);
        return javaMailSender;
    }
}
