package com.lxm.miaosha.redis;

public class UserKey extends BasePrefix{

	
	private UserKey(String prefix) {
		super(0, prefix);
		// TODO Auto-generated constructor stub
	}
	public UserKey(int i, String string) {
		// TODO Auto-generated constructor stub
		super(i, string);
	}
	public static UserKey getById = new UserKey( "id");
	public static UserKey getByName = new UserKey( "name");
	public static UserKey getByTime = new UserKey( 23,"name");

}
