package com.ecombine.service.javamail.dao;

import com.ecombine.service.javamail.pojo.Email;
import com.ecombine.service.javamail.pojo.EmailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EmailMapper {
    long countByExample(EmailExample example);

    int deleteByExample(EmailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Email record);

    int insertSelective(Email record);

    List<Email> selectByExample(EmailExample example);

    Email selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByExample(@Param("record") Email record, @Param("example") EmailExample example);

    int updateByPrimaryKeySelective(Email record);

    int updateByPrimaryKey(Email record);
}