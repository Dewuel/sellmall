package com.jarvanzx.coolcms;


import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LogTest {

    private final Logger logger = LoggerFactory.getLogger(LogTest.class);
    @Test
    public void test1(){
        String name = "aaa";
        String pass = "bbb";
        logger.info("111");
        logger.info("name: {}, pass: {}", name, pass);
    }
}
