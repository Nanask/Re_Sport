package com.nana.sport.dao;

import com.nana.sport.model.QnAVO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper
//public interface QnADao extends GenericDao<QnAVO, String> {
//
//
//}

@Mapper
public interface QnADao {
    public List<QnAVO> selectAll();

}
