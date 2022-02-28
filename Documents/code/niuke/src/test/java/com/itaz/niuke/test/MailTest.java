package com.itaz.niuke.test;

import com.itaz.niuke.NiukeApplication;
import com.itaz.niuke.utils.MailClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

/**
 * @ author: itaz
 * @ date: 2022/2/27
 * @ profile:
 */

@ContextConfiguration(classes = NiukeApplication.class)
@SpringBootTest
public class MailTest {
    @Autowired
    private MailClient mailClient;

    @Test
    public void testMail() {
        mailClient.sendMail("958639920@qq.com", "TEST", "hello itaz");
    }
}
