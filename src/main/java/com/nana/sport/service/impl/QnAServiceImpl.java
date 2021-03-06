package com.nana.sport.service.impl;

import com.nana.sport.dao.QnADao;
import com.nana.sport.model.QnAVO;
import com.nana.sport.service.QnAService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
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

        QnAVO qnaVO = qnaDao.findById(aLong);
//        System.out.println("qnaVO: " + qnaVO);
        return qnaVO;
    }

    @Override
    public int insert(QnAVO qnAVO) {

        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");

        String curDate = sd.format(date);

        qnAVO.setQna_date(curDate);

        int result = qnaDao.insert(qnAVO);

//        System.out.println("QnAVO : " + qnAVO);
//        System.out.println("write result: " + result);
        return result;
    }

    @Override
    public int update(QnAVO qnAVO) {
//        System.out.println("qnaVO: "+ qnAVO);
        int result = 0;
        if(qnAVO != null) {
            result = qnaDao.update(qnAVO);
        }
        return result;
    }

    @Override
    public int delete(Long aLong) {

        System.out.println("aLong: " + aLong);
        int result = qnaDao.delete(aLong);
        return result;
    }
}
