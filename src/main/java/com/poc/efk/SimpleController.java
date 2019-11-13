package com.poc.efk;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class SimpleController {

    private final Logger LOG = LoggerFactory.getLogger(SimpleController.class);

    @PostMapping("/log")
    public void log() {
        LOG.info("Start processing: credit_card_number");
    }
}
