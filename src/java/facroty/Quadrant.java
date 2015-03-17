package com.wxp.dp.facroty;

public class Quadrant {
	String content;
	
	public Quadrant(String content){
		this.content = content;
	}
	public String getQuadrant(){
	    return ("象限内容..."+content);	
	}
}
