package com.lxm.miaosha.result;

public class CodeMsg {
	private int code;
	private String msg;
	
	//通用异常5001XX
	public static CodeMsg SUCCESS = new CodeMsg(0, "success");
	public static CodeMsg SERVER_ERROR = new CodeMsg(500100, "服务端异常");
	
	//登陆模块5002XX
	
	//商品模块5003XX
	
	//订单模块5004XX
	
	//秒杀模块5005XX
	private CodeMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
	public int getCode() {
		return code;
	}
	public String getMsg() {
		return msg;
	}
}
