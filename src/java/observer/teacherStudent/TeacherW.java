package com.wxp.dp.observer.teacherStudent;

public class TeacherW extends Teacher
{

	public TeacherW(Student stu){
		initStudents();
		callStudent(stu);
	}
	@Override
	public void publishHomework(String hw)
	{
		for(int i=0;i<mStudents.size();i++){
			Student stu=(Student)mStudents.get(i);
			stu.doHomework(hw);
		}
	}

	
}
