package edu.fra.uas.service;

import org.springframework.stereotype.Component;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component
public class MessageService {

    private static final Logger log = LoggerFactory.getLogger(MessageService.class);

    private String message;

    public String getMessage() {
        log.debug("getMessage() wurde aufgerufen – aktueller Wert: {}", message);
        return message;
    }

    public void setMessage(String message) {
        log.debug("setMessage() wurde aufgerufen – neuer Wert: {}", message);
        this.message = message;
    }

}
