# Jpa 연관관계

- 항상 두 엔티티간의 연관관계가 필요한지 고려하여 필요하다면 연관관계를 맺는다.
- 외래키가 있어야 하는 엔티티가 연관관계의 주인이 된다.
  - 외래키: 관계형 데이터베이스에서 외래 키(외부 키, Foreign Key)는 한 테이블의 필드(attribute) 중 다른 테이블의 행(row)을 식별할 수 있는 키를 말한다.
- 연관관계는 확장성을 고려한다. (DB구조는 변경하기 어렵다)

## 1:1 일대일
@OneToOne

![1:1](https://blog.kakaocdn.net/dn/IgstQ/btqOt04Y3R7/4F9h04Y3o2q8tYRibQUxS1/img.png)

## N:1 다대일
@ManyToOne
@OneToMany

단방향
![N:1단](https://blog.kakaocdn.net/dn/yHsrm/btqOlfb1Cpi/vmkBErRN3BKrki9AukbR61/img.png)
양방향
![N:1](https://blog.kakaocdn.net/dn/1WCd9/btqOtfO2JLr/4Aj216Oo8PBGbfUKKN2duk/img.png)

## 1:N 일대다


사용 x

## N:M 다대다

@ManyToMany

관계형 데이터 베이스는 다대다 관계를 표현할 수 없다
일대일 다대다 관계로 풀어야 한다.
![image3](https://img1.daumcdn.net/thumb/R1280x0/?scode=mtistory2&fname=https%3A%2F%2Fblog.kakaocdn.net%2Fdn%2Fde0OcH%2FbtqON8bzGTJ%2FfO9tn93VsZohBB7EXBR4rK%2Fimg.png)



## 참조
[제리 devlog](https://jgrammer.tistory.com/entry/JPA-%EB%8B%A4%EC%96%91%ED%95%9C-%EC%97%B0%EA%B4%80%EA%B4%80%EA%B3%84-%EB%A7%A4%ED%95%91-1-%EB%8B%A4%EB%8C%80%EC%9D%BC-%EC%9D%BC%EB%8C%80%EB%8B%A4-1)