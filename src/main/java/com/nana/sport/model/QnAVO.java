package com.nana.sport.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class QnAVO {

    private Long qna_seq;//` bigint NOT NULL AUTO_INCREMENT,
    private String qna_id;//` varchar(20) NOT NULL,
    private String qna_title;// varchar(500) NOT NULL,
    private String qna_name;// varchar(500) NOT NULL,
    private String qna_text;// varchar(3000) NOT NULL,
    private String qna_email;// varchar(50) NOT NULL,
    private String qna_date;// varchar(30) NOT NULL,
    private Integer qna_count;// int DEFAULT '0',
}
