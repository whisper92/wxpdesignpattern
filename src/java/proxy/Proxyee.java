package com.wxp.dp.proxy;

/*被代理的对象*/
public class Proxyee implements Behavior
{

	@Override
	public void action()
	{
		System.out.println("do sth...");
	}

	
}
