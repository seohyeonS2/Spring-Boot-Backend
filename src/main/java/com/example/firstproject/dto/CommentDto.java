package com.example.firstproject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //모든 필드를 매개변수로 갖는 생성자 자동 생성
@NoArgsConstructor //매개변수가 아예 없는 기본 생성자 자동 생성
@Getter //각 필드 값을 조회할 수 있는 getter 메서드 자동 생성
@ToString //모든 필드를 출력할 수 있는 toString 메서드 자동 생성
public class CommentDto {
    private  Long id;
    private Long articleId;
    private String nickname;
    private String body;
}
