package com.dh.gulimall.gulimallcoupon.dao;

import com.dh.gulimall.gulimallcoupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 17:05:46
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
