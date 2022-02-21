package com.nana.sport.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.nana.sport.model.QnAVO;
import com.nana.sport.service.QnAService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/qna")
public class QnAController {

    private QnAService qnaService;

    public QnAController(QnAService qnaService) {
        this.qnaService = qnaService;
    }

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main() {

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
    @RequestMapping(value = "/", method = RequestMethod.POST)
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

    @ResponseBody
    @RequestMapping(value = "/{qna_seq}", method = RequestMethod.GET)
    public String findById(@PathVariable("qna_seq") Long qna_seq, QnAVO qnAVO) {

//        if(qna_seq != null) {
//            System.out.println("qna_seq: " + qna_seq);
        qnAVO = qnaService.findById(qna_seq);

        ObjectMapper objMapper = new ObjectMapper();
        String jsonString = null;
        try {
            jsonString = objMapper.writeValueAsString(qnAVO);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            System.out.println("Json 오류");
        }
        return jsonString;

//        }

//        return "FAIL";
    }

    @ResponseBody
    @RequestMapping(value = "/{qna_seq}", method = RequestMethod.PUT)
    public String update(@RequestBody QnAVO qnAVO) {
        if (qnAVO != null) {
            System.out.println("qnaVO: " + qnAVO);
            int result = qnaService.update(qnAVO);
            
            if (result != 1) {
                return "sql 등록안됨";
            }else {
                ObjectMapper objMapper = new ObjectMapper();
                String jsonString = null;
                try {
                    jsonString = objMapper.writeValueAsString(qnAVO);
                } catch (JsonProcessingException e) {
                    e.printStackTrace();
                    System.out.println("Json 오류");
                }
                return jsonString;

            }

        }
        return "FAIL";
    }

}