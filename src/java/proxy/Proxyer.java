package com.wxp.dp.proxy;
/*代理者*/
public class Proxyer implements Behavior
{

	Behavior beha;
	public Proxyer(){
		beha=new Proxyee();
	}
	@Override
	public void action()
	{
		System.out.println("start proxying");
		beha.action();//调用被代理者的行为方法
		System.out.println("end proxying");
	}

	
}
