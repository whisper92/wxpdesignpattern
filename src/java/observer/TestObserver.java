package com.wxp.dp.observer;

import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.observer.policCitizen.ZJCitizen;
import com.wxp.dp.observer.policCitizen.ZJPoliceman;
import com.wxp.dp.observer.teacherStudent.StudentP;
import com.wxp.dp.observer.teacherStudent.Teacher;
import com.wxp.dp.observer.teacherStudent.TeacherW;
import com.wxp.dp.singleton.Admins;

/**
 * 测试：观察者模式
 * @author wxp
 *
 */
public class TestObserver {
	public static void main(String[] args) {

		StudentP pcx = new StudentP("pcx");
		TeacherW wxp = new TeacherW(pcx);
		wxp.publishHomework("woqu");
		
		ZJPoliceman policeman = new ZJPoliceman();
		ZJCitizen citizen = new ZJCitizen(policeman);
		citizen.sendMessage("normal");
		

		
	}
}
