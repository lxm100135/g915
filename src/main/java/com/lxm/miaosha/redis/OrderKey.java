package com.lxm.miaosha.redis;

public class OrderKey extends BasePrefix{

	private OrderKey(int expireSeconds, String prefix) {
		super(expireSeconds, prefix);
		// TODO Auto-generated constructor stub
	}

}
