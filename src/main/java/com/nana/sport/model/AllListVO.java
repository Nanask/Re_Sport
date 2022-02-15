package com.nana.sport.model;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AllListVO {

    private Long al_seq;
    private String al_code;
    private String al_name;
    private String al_tel;
    private String al_sport;
    private String al_addr;
    private String al_free;
}
