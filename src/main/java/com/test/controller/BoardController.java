package com.test.controller;


import com.test.domain.dto.BoardDto;
import com.test.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class BoardController {

    @Autowired // 제어역전 [DI] 스프링 컨테이너 위임 || 스프링 컨테이너 빈생성[외부에 메모리 위임]
    private BoardService boardService;

    //////////////////////////////////////////////////////////////
    // 게시글 등록
    @PostMapping("/setboard")
    public int setboard (BoardDto boardDto){
       int result  = boardService.setboard(boardDto);
        return result;
    }
    // 게시글 출력
    @GetMapping("/list")
    @ResponseBody
    public List<BoardDto> list(){
        List<BoardDto> list = boardService.list();
        System.out.println("확인 ::: "+list);
        return list;
    }














}
