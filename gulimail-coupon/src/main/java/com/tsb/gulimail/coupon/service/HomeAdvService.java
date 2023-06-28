package com.tsb.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.coupon.entity.HomeAdvEntity;

import java.util.Map;

/**
 * 
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:10:48
 */
public interface HomeAdvService extends IService<HomeAdvEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

