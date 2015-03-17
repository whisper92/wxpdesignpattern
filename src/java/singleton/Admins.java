package com.wxp.dp.singleton;

/**
 * 饿汉式单例
 * @author wxp
 *
 */
public class Admins {
	private static String name = "wxp";
	private static Admins admins = new Admins(name);
	private Admins(String name){
		
	}
	public static Admins getInstance(){
		return admins;
	}

	public void getName(){
		System.out.println(name);
	}
	
}
