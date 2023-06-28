package com.tsb.gulimail.ware.entity;

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
 * @date 2023-06-28 19:15:15
 */
@Data
@TableName("wms_ware_order_task")
public class WareOrderTaskEntity implements Serializable {
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
	 * 
	 */
	private String consignee;
	/**
	 * 
	 */
	private String consigneeTel;
	/**
	 * 
	 */
	private String deliveryAddress;
	/**
	 * 
	 */
	private String orderComment;
	/**
	 *  1: 2:
	 */
	private Integer paymentWay;
	/**
	 * 
	 */
	private Integer taskStatus;
	/**
	 * 
	 */
	private String orderBody;
	/**
	 * 
	 */
	private String trackingNo;
	/**
	 * create_time
	 */
	private Date createTime;
	/**
	 * id
	 */
	private Long wareId;
	/**
	 * 
	 */
	private String taskComment;

}
