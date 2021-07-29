package com.example.mailsender.mail.service;

import com.example.mailsender.mail.dto.request.MailRequest;

public interface MailService {
    boolean send(MailRequest mailRequest);

    void getMail();
}
