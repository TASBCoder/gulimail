package com.tsb.gulimail.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.coupon.entity.HomeSubjectEntity;

import java.util.Map;

/**
 * jd
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:10:48
 */
public interface HomeSubjectService extends IService<HomeSubjectEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

