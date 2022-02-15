package com.nana.sport.service.impl;

import com.nana.sport.dao.AllListDao;
import com.nana.sport.model.AllListVO;
import com.nana.sport.service.DetailService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetailServiceImpl implements DetailService {

    private final AllListDao allListDao;

    public DetailServiceImpl(AllListDao allListDao) {
        this.allListDao = allListDao;
    }


    @Override
    public List<AllListVO> selectAll() {

        List<AllListVO> alList = allListDao.selectAll();
        System.out.println("alList : "+ alList);

        return null;
    }

    @Override
    public AllListVO findById(Long aLong) {
        return null;
    }

    @Override
    public int insert(AllListVO allListVO) {
        return 0;
    }

    @Override
    public int update(AllListVO allListVO) {
        return 0;
    }

    @Override
    public int delete(AllListVO allListVO) {
        return 0;
    }
}
