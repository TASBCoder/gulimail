package com.tsb.gulimail.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 15:57:33
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

