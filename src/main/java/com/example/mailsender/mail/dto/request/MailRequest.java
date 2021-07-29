package com.example.mailsender.mail.dto.request;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class MailRequest {
    private String to;
    private String title;
    private String body;
}
