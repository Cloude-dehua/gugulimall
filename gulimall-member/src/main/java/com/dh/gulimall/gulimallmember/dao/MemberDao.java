package com.dh.gulimall.gulimallmember.dao;

import com.dh.gulimall.gulimallmember.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 17:21:27
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
