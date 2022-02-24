package com.nana.sport.service;

import com.nana.sport.dao.GenericDao;
import com.nana.sport.model.AllListVO;

import java.util.List;

public interface DetailService extends GenericDao<AllListVO, Long> {

    public List<AllListVO> searchResult();
}
