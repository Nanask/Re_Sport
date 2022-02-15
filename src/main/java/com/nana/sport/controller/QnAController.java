package com.nana.sport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nana.sport.model.QnAVO;
import com.nana.sport.service.QnAService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/qna")
public class QnAController {

    private QnAService qnaService;

    public QnAController(QnAService qnaService) {
        this.qnaService = qnaService;
    }

    @ResponseBody
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String main(){

        List<QnAVO> qnaList = qnaService.selectAll();

        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objMapper.writeValueAsString(qnaList);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Json 오류");
        }

        return jsonString;
//        return qList.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/write", method = RequestMethod.POST)
    public String write(@RequestBody QnAVO qnAVO) {
        if (qnAVO != null) {
            System.out.println(qnAVO);
            int result = qnaService.insert(qnAVO);
//            System.out.println("result : "+ result);
            if (result != 1) {
                return "SQL 오류 !";
            }
            return "OK";
        }
        return "FAIL";
    }
}