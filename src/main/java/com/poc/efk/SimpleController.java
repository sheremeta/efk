package com.poc.efk;

import com.google.common.base.Stopwatch;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/")
public class SimpleController {

    private final Logger LOG = LoggerFactory.getLogger(SimpleController.class);

    @PostMapping("/log")
    @SuppressWarnings("all")
    public void log() throws InterruptedException {
        Stopwatch stopwatch = Stopwatch.createUnstarted();

        for (int i = 0; i < 300000; i++) {
            stopwatch.start();

            LOG.info("Start processing: 4485796040979774 for client with uuid {}", UUID.randomUUID().toString());

            System.out.println(stopwatch);

            stopwatch.reset();
        }

    }
}
