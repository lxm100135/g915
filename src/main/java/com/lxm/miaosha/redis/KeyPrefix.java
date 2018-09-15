package com.lxm.miaosha.redis;

public interface KeyPrefix {
	public int expireSeconds();
	public String getPrefix();
}
