# mail_sender

## GET http://localhost:8080/mail
pop3 사용해서 메일 내용 읽기
타이틀 검색 및 발송인 검색은 ServiceImpl에 주석처리 되어있다.


## POST http://localhost:8080/mail
Content-Type: application/json

{
  "to": "메일",
  "title": "타이틀",
  "body": "이름 : <input type='text' name='content' ><br>"
}

사용해서 메일 전송
