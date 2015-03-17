package com.wxp.dp.observer.policCitizen;
public class ZJPoliceman implements PoliceMan
{

	@Override
	public void action(Citizen citizen)
	{
		String help=citizen.getHelp();
		if(help.equals("normal")){
		   System.out.println("正常");	
		}else {
			System.out.println("不正常");
		}
	}

	
}
