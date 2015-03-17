package com.wxp.dp.adapter;
/*基于方形画圆形的适配器*/
public class DrawCircleAdapter extends Square
{
	Circle circle;
	public DrawCircleAdapter(Circle circle){
		this.circle=circle;
	}
	
	/*重载父类的drawSquare方法,此时画出来的是一个圆*/
	@Override
	public void drawSquare(String str){
		this.circle.drawCircle(str);
	}
}
