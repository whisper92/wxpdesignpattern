package com.wxp.dp.singleton;
import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.singleton.Admins;

/**
 * 测试：单例模式
 * @author wxp
 *
 */
public class TestSingleton
{
	public static void main(String[] args)
	{
		Admins admins = Admins.getInstance();
		admins.getName();
	}
}
