package com.wxp.dp.facroty;
import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.singleton.Admins;

/**
 *测试：工厂方法模式
 * @author wxp
 *
 */
public class TestFactory
{
	public static void main(String[] args)
	{
	  INoteFactory noteFactory = new NoteFactory();
	  INote note = noteFactory.createNote();
	  note.showNote();
	  
	}
}
