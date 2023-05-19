package com.example.fabianworkshopbackend.Controller;

import com.example.fabianworkshopbackend.Model.Order;
import com.example.fabianworkshopbackend.Service.EmailService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpClient;

@RestController
@CrossOrigin
public class EmailController {
    EmailService emailService = new EmailService();

    @PostMapping("/emailreply")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> postOrder(@RequestBody Order order) throws Exception {
        return emailService.autoreplyService("Email text response", order);
    }

}
