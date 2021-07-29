# mail_sender

## GET http://localhost:8080/mail
타이틀 검색 기능 미적용X
pop3 사용해서 메일 내용 읽기


## POST http://localhost:8080/mail
Content-Type: application/json

{
  "to": "메일",
  "title": "타이틀",
  "body": "이름 : <input type='text' name='content' ><br>"
}

사용해서 메일 전송
