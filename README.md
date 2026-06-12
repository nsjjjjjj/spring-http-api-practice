# Second Week Project

Spring Boot에서 HTTP 요청 방식을 연습하기 위해 만든 API 실습 프로젝트입니다. `GET`, `POST`, `PUT`, `DELETE` 요청을 각각 Controller로 나누어 작성했습니다.

## 기술 스택

- Java
- Spring Boot
- Maven
- Swagger 설정

## 구현 내용

- `GetController`: 쿼리 파라미터와 경로 변수 요청 처리
- `PostController`: 요청 body를 DTO로 받는 연습
- `PutController`: 수정 요청 처리 연습
- `DeleteController`: 삭제 요청 처리 연습
- `PostRequestDto`: 요청 데이터를 담는 DTO
- `SwaggerConfig`: API 문서 설정 실습

## 실행 방법

```bash
./mvnw spring-boot:run
```

테스트는 다음 명령어로 실행합니다.

```bash
./mvnw test
```

## 저장소 성격

완성된 서비스라기보다는 Spring Boot API 요청/응답 흐름을 익히기 위한 실습 저장소입니다. 포트폴리오용으로 발전시키려면 실제 도메인, 데이터 저장소, 예외 처리, 테스트 케이스를 추가하는 것이 좋습니다.
