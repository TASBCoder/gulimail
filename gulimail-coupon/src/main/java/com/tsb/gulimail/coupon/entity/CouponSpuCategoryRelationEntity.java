package com.tsb.gulimail.coupon.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * 
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:10:48
 */
@Data
@TableName("sms_coupon_spu_category_relation")
public class CouponSpuCategoryRelationEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * id
	 */
	private Long couponId;
	/**
	 * id
	 */
	private Long categoryId;
	/**
	 * 
	 */
	private String categoryName;

}
