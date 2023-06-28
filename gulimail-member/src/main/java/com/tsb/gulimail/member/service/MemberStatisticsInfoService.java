package com.tsb.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * huiyuantongjixi
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:13:01
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

