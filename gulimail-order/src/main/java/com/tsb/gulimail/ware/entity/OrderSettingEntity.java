package com.tsb.gulimail.ware.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

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
@TableName("oms_order_setting")
public class OrderSettingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * id
	 */
	@TableId
	private Long id;
	/**
	 * ()
	 */
	private Integer flashOrderOvertime;
	/**
	 * ()
	 */
	private Integer normalOrderOvertime;
	/**
	 *
	 */
	private Integer confirmOvertime;
	/**
	 *
	 */
	private Integer finishOvertime;
	/**
	 *
	 */
	private Integer commentOvertime;
	/**
	 * 0--
	 */
	private Integer memberLevel;

}
