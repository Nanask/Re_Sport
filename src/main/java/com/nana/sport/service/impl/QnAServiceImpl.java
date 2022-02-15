package com.nana.sport.service.impl;

import com.nana.sport.dao.QnADao;
import com.nana.sport.model.QnAVO;
import com.nana.sport.service.QnAService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QnAServiceImpl implements QnAService {

    protected final QnADao qnaDao;

    @Override
    public List<QnAVO> selectAll() {

        List<QnAVO> qList= qnaDao.selectAll();
//        System.out.println("qList :" + qList);

        return qList;
    }

    @Override
    public QnAVO findById(Long aLong) {
        return null;
    }

    @Override
    public int insert(QnAVO qnAVO) {
        return 0;
    }

    @Override
    public int update(QnAVO qnAVO) {
        return 0;
    }

    @Override
    public int delete(Long aLong) {
        return 0;
    }
}
