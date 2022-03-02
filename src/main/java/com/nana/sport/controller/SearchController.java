package com.nana.sport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nana.sport.model.AllListVO;
import com.nana.sport.service.DetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {

    private final DetailService detailService;

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {
        List<AllListVO> alList = detailService.selectAll();
        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objMapper.writeValueAsString(alList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Json 오류");
        }
        return jsonString;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String search(@RequestBody String al_addr, String al_free ) {

        System.out.println("al_addr : " + al_addr);
        System.out.println("al_free : " + al_free);
        return "search";
    }
}
