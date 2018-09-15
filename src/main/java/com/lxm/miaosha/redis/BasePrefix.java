package com.lxm.miaosha.redis;

public abstract class BasePrefix implements KeyPrefix{

	private int expireSeconds;
	private String prefix;
	
	public BasePrefix( String prefix) {//0代表永不过期
		this(0, prefix);
	}
	public BasePrefix(int expireSeconds, String prefix) {
		this.expireSeconds = expireSeconds;
		this.prefix = prefix;
	}
	public int expireSeconds() {//默认0代表永不过期
		// TODO Auto-generated method stub
		return expireSeconds;
	}

	public String getPrefix() {
		String className = getClass().getSimpleName();//达到每一个前缀都不一样
		return className +":"+ prefix;
	}

}
