package com.tsb.gulimail.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.ware.entity.OrderReturnApplyEntity;

import java.util.Map;

/**
 *
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:08:50
 */
public interface OrderReturnApplyService extends IService<OrderReturnApplyEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

