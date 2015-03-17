package com.wxp.dp.observer.teacherStudent;
import java.util.List;
import java.util.*;
public abstract class Teacher
{
	String mHomework="homework";
	List mStudents;
	public abstract void publishHomework(String hw);
	
	public void setHomework(String hw){
		this.mHomework=hw;
	}
	
	public String getHomework(){
		return mHomework;
	}
	
	public void initStudents(){
		this.mStudents=new ArrayList();
	}
	
	public void callStudent(Student stu){
		this.mStudents.add(stu);
	}
	
	public void unCallStudent(Student stu){
		this.mStudents.remove(stu);
	}
}
