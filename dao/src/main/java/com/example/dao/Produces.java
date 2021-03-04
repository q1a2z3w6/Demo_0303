package com.example.dao;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Produces implements Serializable {

	private static final long serialVersionUID =  7855400127364606687L;

	/**
	 * 主键
	 */
	private Integer id;

	/**
	 * 名称
	 */
	private String name;

	/**
	 * 价格
	 */
	private BigDecimal price;

	/**
	 * 数量
	 */
	private Integer num;

}
