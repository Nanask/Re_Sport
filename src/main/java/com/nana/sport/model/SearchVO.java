package com.nana.sport.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class SearchVO {

    private Long sp_seq;//bigint NOT NULL AUTO_INCREMENT,
    private Long sp_money;// varchar(10) DEFAULT NULL,
    private Long sp_district;// varchar(20) DEFAULT NULL,
    private Long sp_search;// varchar(500) DEFAULT NULL,
    private Long sp_sport;// varchar(100) DEFAULT NULL,
}
