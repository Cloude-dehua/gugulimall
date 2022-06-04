package com.dh.gulimall.gulimallorder.dao;

import com.dh.gulimall.gulimallorder.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 17:35:04
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
