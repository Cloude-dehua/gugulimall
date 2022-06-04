package com.dh.gulimall.gulimallorder.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.dh.common.utils.PageUtils;
import com.dh.gulimall.gulimallorder.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author dehua
 * @email dehua@gmail.com
 * @date 2022-01-21 17:35:04
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

