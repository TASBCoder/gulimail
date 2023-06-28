package com.tsb.gulimail.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.tsb.common.utils.PageUtils;
import com.tsb.gulimail.member.entity.MemberReceiveAddressEntity;

import java.util.Map;

/**
 * 
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:13:02
 */
public interface MemberReceiveAddressService extends IService<MemberReceiveAddressEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

