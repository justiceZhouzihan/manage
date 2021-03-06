package com.jiudian.manage.mapper;

import com.jiudian.manage.model.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderid);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer orderid);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> getAllUser();

    List<Order> getListByPhone(long holdphone);

    List<Order> getListByUser(Integer userid);
}