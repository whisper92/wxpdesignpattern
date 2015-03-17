package com.wxp.dp.observer.policCitizen;
public class ZJCitizen extends Citizen
{
	public ZJCitizen(PoliceMan policeman){
		initPolice();
		register(policeman);
	}

	@Override
	public void sendMessage(String help)
	{
		setHelp(help);
		for(int i=0;i<police.size();i++){
			PoliceMan pol=(PoliceMan)police.get(i);
			pol.action(this);
		}
		
	}

	
}
