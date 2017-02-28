package com.jin.config;

import com.github.pagehelper.PageHelper;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Properties;

/**
 * Created by Fred Jin on 2017/2/18.
 */
//@Configuration
public class MybatisConfiguration {

    //@Bean
    public PageHelper pageHelper(){
        System.out.println("MybatisConfiguration");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();

        p.setProperty("offsetAsPageNum","true");
        p.setProperty("rowBoundsWithCount","true");
        p.setProperty("reasonable","true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
