package com.jiudian.manage.mapper;

import com.jiudian.manage.model.Config;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Config record);

    int insertSelective(Config record);

    Config selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Config record);

    int updateByPrimaryKey(Config record);
}