package com.dh.gulimall.gulimallcoupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dh.common.utils.PageUtils;
import com.dh.gulimall.gulimallcoupon.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 17:05:46
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

