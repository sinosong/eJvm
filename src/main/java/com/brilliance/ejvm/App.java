package com.brilliance.ejvm;

import com.brilliance.ejvm.dao.IExecuteService;
import com.brilliance.ejvm.dao.impl.ExecuteServiceImpl;
import com.brilliance.ejvm.util.SpringContextUtils;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author : hannasong
 * @version : v1.0
 * @date : Created in 4:32 下午 2019/10/17
 * @description : 程序入口
 */
@EnableTransactionManagement
@SpringBootApplication(scanBasePackages = "com.brilliance.ejvm")
@MapperScan("com.brilliance.ejvm.mapper")
public class App
{
    protected final static Logger logger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args )
    {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);

        IExecuteService executeService = (IExecuteService) SpringContextUtils.getBean("defaultExecuteService", ExecuteServiceImpl.class);
        executeService.produder();
    }
}
