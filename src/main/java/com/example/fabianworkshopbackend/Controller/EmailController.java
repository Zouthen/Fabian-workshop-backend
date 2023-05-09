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

    /*
    @PostMapping("/emailreply")
    public String autoReply(
            @RequestParam ("name") String name,
            @RequestParam ("email") String email,
            @RequestParam ("woodType") String woodType,
            @RequestParam ("PriceEstimate") String PriceEstimate,
            @RequestParam ("MetalType") String MetalType,
            @RequestParam ("engravingText") String engravingText
            ){
        Order order = new Order(name,email,woodType,PriceEstimate,MetalType,engravingText);
        System.out.println("hello");
        try {
            emailService.autoreplyService("Email text response", order);
            emailService.autoEmailFabian(order);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/confirmationPage";
    }

    @GetMapping("/confirmationPage")
    public void confirmationPage(){
    }
     */

    @PostMapping("/emailreply")
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<String> postOrder(@RequestBody Order order) throws Exception {
        return emailService.autoreplyService("Email text response", order);
    }

}
