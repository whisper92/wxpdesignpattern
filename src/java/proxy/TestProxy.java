package com.wxp.dp.proxy;
import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.singleton.Admins;

/**
 * 测试：代理模式
 * @author wxp
 *
 */
public class TestProxy
{
	public static void main(String[] args)
	{
		Proxyer proxyer = new Proxyer();
		proxyer.action();
	}
}
