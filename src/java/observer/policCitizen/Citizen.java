package com.wxp.dp.observer.policCitizen;
import java.util.List;
import java.util.*;
public abstract class Citizen
{
	List police;
	String help="normal";
	abstract void sendMessage(String help);
	public void setHelp(String help){
		this.help=help;
	}
	
	public String getHelp(){
		return help;
	}
	
	public void initPolice(){
		this.police=new ArrayList();
	}
	
	public void register(PoliceMan policeman){
		this.police.add(policeman);
	}
	public void unRegister(PoliceMan policeman){
		this.police.remove(policeman);
	}
}
