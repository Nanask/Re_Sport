package com.nana.sport.service;

import com.nana.sport.model.QnAVO;
import org.springframework.stereotype.Service;

import java.util.List;

public interface QnAService {

    public List<QnAVO> selectAll();
}
