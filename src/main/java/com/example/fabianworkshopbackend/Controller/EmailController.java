package com.example.fabianworkshopbackend.Controller;

import com.example.fabianworkshopbackend.Model.Email;
import com.example.fabianworkshopbackend.Service.EmailService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    EmailService emailService = new EmailService();

    @GetMapping("/emailautoreply")
    public Email autoReply(@RequestBody Email email){
        try {
            emailService.autoreplyService("Email text response");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return email;
    }

}
