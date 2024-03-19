# Spring Data MongoDB 예제

1. `docker-compose up -d` 명령어를 실행하여 MongoDB 구동
2. http://localhost:8081 접속하여 mongo-express 구동 확인
    - `ME_CONFIG_BASICAUTH_USERNAME`, `ME_CONFIG_BASICAUTH_PASSWORD` 정보로 로그인
3. Application 실행
4. `http/userRequests.http` 파일을 이용하여 API 요청하며 확인
    - Database, Collection이 없어도 문제가 발생하지 않는다.
    - 최초 save 시 Database와 Collection이 자동 생성된다.

## 참고 자료

- https://umanking.github.io/2023/08/04/spring-boot-mongodb/