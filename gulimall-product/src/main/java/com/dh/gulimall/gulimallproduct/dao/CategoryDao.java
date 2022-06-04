package com.dh.gulimall.gulimallproduct.dao;

import com.dh.gulimall.gulimallproduct.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 15:18:13
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
