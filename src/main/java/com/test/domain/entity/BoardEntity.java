package com.test.domain.entity;

import com.test.domain.dto.BoardDto;
import lombok.*;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class BoardEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private int bno;
    private String btitle;
    private String bcontent;

    public BoardDto toDto(){
        return BoardDto.builder()
               .bno(this.bno)
               .btitle(this.btitle)
               .bcontent(this.bcontent)
               .build();
    }

}
