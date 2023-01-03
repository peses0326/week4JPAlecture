package com.example.member;

import com.example.member.member.entity.Member;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 기본적인 컴포넌트 스캔 대상
 * @Component : 컴포넌트 스캔에서 사용
 * @Controller : 스프링 MVC 컨트롤러에서 사용
 * @Service : 스프링 비즈니스 로직에서 사용
 * @Repository : 스프링 데이터 접근 계층에서 사용
 * @Configuration : 스프링 설정 정보에서 사용
 */
@SpringBootApplication // @ComponentScan 어노테이션 내장
@Configuration
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);
    }
}
