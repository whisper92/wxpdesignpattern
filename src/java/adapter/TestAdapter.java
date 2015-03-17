package com.wxp.dp.adapter;
import java.util.*;

import com.wxp.dp.adapter.*;
import com.wxp.dp.singleton.Admins;

/**
 *测试： 适配器模式
 * @author wxp
 *
 */
public class TestAdapter
{
	public static void main(String[] args)
	{
	  Square sq=new	DrawCircleAdapter(new Circle());
	  sq.drawSquare("CIRCLE");
	}
}
