package com.tsb.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:13:01
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

