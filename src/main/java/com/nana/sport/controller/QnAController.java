package com.nana.sport.controller;

import com.nana.sport.model.QnAVO;
import com.nana.sport.service.QnAService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping(value = "/qna")
public class QnAController {

    private QnAService qnaService;

    public QnAController(QnAService qnAService) {
        this.qnaService = qnAService;
    }

    @ResponseBody
    @RequestMapping(value = "/list" , method = RequestMethod.GET)
    public String main(){

        List<QnAVO> qList = qnaService.selectAll();

        return qList.toString();
    }
}