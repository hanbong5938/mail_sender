package com.example.mailsender.mail.controller;


import com.example.mailsender.mail.dto.request.MailRequest;
import com.example.mailsender.mail.service.MailService;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public record MailController(MailService mailService) {
    @PostMapping("/mail")
    public ResponseEntity<Boolean> execMail(@RequestBody MailRequest mailRequest) {
        boolean isSuccess = mailService.send(mailRequest);
        log.info("메일 전송 성공 여부 : {}", isSuccess);
        return ResponseEntity.ok(isSuccess);
    }

    @GetMapping("/mail")
    public ResponseEntity<String> execMail() {
        mailService.getMail();
        return ResponseEntity.ok("ok");
    }
}
