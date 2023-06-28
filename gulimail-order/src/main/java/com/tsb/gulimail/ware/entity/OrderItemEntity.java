package com.tsb.gulimail.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.io.Serializable;

import lombok.Data;

/**
 *
 *
 * @author SongBo
 * @email 616907739@gmail.com
 * @date 2023-06-28 19:08:50
 */
@Data
@TableName("oms_order_item")
public class OrderItemEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * order_id
	 */
	private Long orderId;
	/**
	 * order_sn
	 */
	private String orderSn;
	/**
	 * spu_id
	 */
	private Long spuId;
	/**
	 * spu_name
	 */
	private String spuName;
	/**
	 * spu_pic
	 */
	private String spuPic;
	/**
	 *
	 */
	private String spuBrand;
	/**
	 * id
	 */
	private Long categoryId;
	/**
	 * sku
	 */
	private Long skuId;
	/**
	 * sku
	 */
	private String skuName;
	/**
	 * sku
	 */
	private String skuPic;
	/**
	 * sku
	 */
	private BigDecimal skuPrice;
	/**
	 *
	 */
	private Integer skuQuantity;
	/**
	 * JSON
	 */
	private String skuAttrsVals;
	/**
	 *
	 */
	private BigDecimal promotionAmount;
	/**
	 *
	 */
	private BigDecimal couponAmount;
	/**
	 *
	 */
	private BigDecimal integrationAmount;
	/**
	 *
	 */
	private BigDecimal realAmount;
	/**
	 *
	 */
	private Integer giftIntegration;
	/**
	 *
	 */
	private Integer giftGrowth;

}
