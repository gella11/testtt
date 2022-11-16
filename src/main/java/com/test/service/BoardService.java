package com.test.service;


import com.test.domain.dao.BoardDao;
import com.test.domain.dto.BoardDto;
import com.test.domain.entity.BoardEntity;
import com.test.domain.entity.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;



    // 게시물 등록
    public int setboard(BoardDto boardDto){
        BoardEntity entity = boardRepository.save(boardDto.toEntity() );
        return entity.getBno();
    }

    // 게시물 출력
    public List<BoardDto> list(){
        // 1. JPA를 이용한 모든 엔티티 호출
        List<BoardEntity> list =  boardRepository.findAll();
        // 2. 엔티티 --> DTO
        List<BoardDto> dtoList = new ArrayList<>();
        for(BoardEntity entity : list) {
            dtoList.add(entity.toDto());
        }
        return dtoList;
    }


}
