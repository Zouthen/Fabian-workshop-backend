package com.example.fabianworkshopbackend.Service;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;

public class EmailService {
    private String senderAddress;
    private String recipientAddress;

    public EmailService(String senderAddress, String recipientAddress) {
        this.senderAddress = senderAddress;
        this.recipientAddress = recipientAddress;
    }
    public EmailService() {
    }

    public void autoreplyService(String response) throws Exception {
        Email email = new SimpleEmail();

        email.setHostName("smtp.googlemail.com");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("username", "password"));
        email.setSSLOnConnect(true);

        email.setFrom(senderAddress);
        email.setSubject("Auto Response");
        email.setMsg(response);
        email.addTo(recipientAddress);
        email.send();
    }

}