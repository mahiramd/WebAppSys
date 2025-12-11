package controller;

import org.springframework.stereotype.Controller;

import edu.fra.uas.service.MessageService;

@Controller
public class BeanController {

    private final MessageService messageService;

    public BeanController(MessageService messageService) {
        this.messageService = messageService;
    }

    public String putMessage(String message) {
        messageService.setMessage(" put messgae: " + message);
        return messageService.getMessage();
    }

}
