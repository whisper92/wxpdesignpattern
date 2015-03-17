package com.wxp.dp.template;
import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.singleton.Admins;

/**
 * 测试：模版方法模式
 * @author wxp
 *
 */
public class TestTemplate
{
	public static void main(String[] args)
	{
		int[] array = new int[]{1,3,2,4,6,7,5};
		AbstractQuadrant abstractQuadrant = new NoteQuadrant();
		abstractQuadrant.showContent(array);
	}
}
