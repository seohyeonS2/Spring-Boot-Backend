package com.example.firstproject.service;

import org.junit.jupiter.api.Test; //Test 패키지 임포트
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*; //앞으로 사용할 수 있는 패키지 임포트

@SpringBootTest //해당 클래스를 스프링 부트와 연동해 테스트
class ArticleServiceTest {
    @Autowired
    ArticleService articleService; //articleService 객체 주입
    @Test //해당 메서드가 테스트 코드임을 선언
    void index() {
    }
}