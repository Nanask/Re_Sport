package com.nana.sport.dao;

import com.nana.sport.model.AllListVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AllListDao extends GenericDao<AllListVO, Long> {
}
