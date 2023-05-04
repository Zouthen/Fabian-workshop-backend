package com.example.fabianworkshopbackend.Service;

import com.example.fabianworkshopbackend.Model.Order;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {
    private String senderAddress = "keatest69@gmail.com";
    private String recipientAddress;

    public EmailService(String senderAddress, String recipientAddress) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }
    public EmailService() {
    }

    public void autoreplyService(String response, Order order) throws Exception {
        Email email = new SimpleEmail();

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(senderAddress, "hlektwrpukyrsmlb"));
        email.setSSLOnConnect(true);

        email.setFrom(senderAddress);
        email.setSubject("Auto Response");
        email.setMsg(response);
        email.addTo(order.email);
        email.send();
    }

    public void autoEmailFabian(Order order) throws Exception {
        Email email = new SimpleEmail();
        // To make it work with gmail, you need 2-factor verification,
        // and then generate an app password which is used below instead of the mail password
        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator(senderAddress, "hlektwrpukyrsmlb"));
        email.setSSLOnConnect(true);

        email.setFrom(senderAddress);
        email.setSubject("Auto Response");
        email.setMsg(
                "Name: " + order.name +
                " Email: " + order.email +
                " Wood: " + order.woodType +
                " Price estimate: " + order.priceEstimate +
                " Metal type: " + order.metalType +
                " Engraving: " + order.engravingText);
        email.addTo(senderAddress);
        email.send();
    }

}