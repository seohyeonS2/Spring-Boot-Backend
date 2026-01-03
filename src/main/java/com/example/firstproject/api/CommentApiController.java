package com.example.firstproject.api;

import com.example.firstproject.dto.CommentDto;
import com.example.firstproject.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CommentApiController {
    @Autowired
    private CommentService commentService;
    @GetMapping("/api/articles/{articleId}/comments") //댓글 조회 요청 접수
    public ResponseEntity<List<CommentDto>> comments(@PathVariable Long articleId){ //comments() 메서드 생성
        return null; //null 반환
        //서비스에 위임
        List<CommentDto> dtos=commentService.comments(articleId);
        //결과 응답
        return ResponseEntity.status(HttpStatus.OK).body(dtos);
    }

}
