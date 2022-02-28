package com.itaz.niuke.test;

import com.itaz.niuke.NiukeApplication;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

/**
 * @ author: itaz
 * @ date: 2022/2/28
 * @ profile:
 */
@ContextConfiguration(classes = NiukeApplication.class)
@SpringBootTest
public class LoggerTest {
    private static final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void testLogger(){
        logger.debug("debug");
        logger.info("info");
        logger.warn("wran");
        logger.error("error");
    }
}
