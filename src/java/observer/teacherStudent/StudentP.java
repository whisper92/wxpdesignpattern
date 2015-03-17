package com.wxp.dp.observer.teacherStudent;

public class StudentP extends Student
{

	String name = "";
	public StudentP(String name){
		this.name = name;
	}
	@Override
	public void doHomework(String hw)
	{
		System.out.print(name+"说：");
		if(hw.length()>5){
			System.out.println(hw+"作业好多啊");
		} else{
			System.out.println(hw+"作业不多啊");
		}
	}

	
}
