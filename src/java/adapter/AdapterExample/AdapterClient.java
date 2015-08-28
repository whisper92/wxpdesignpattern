
/**
 *测试： 适配器模式
 * @author wxp
 *
 */
public class AdapterClient
{
	public static void main(String[] args)
	{
	    DrawBitmap draw=new DrawCircleAdapter();
	    draw.drawSquare(4);
	    draw.drawCircle(2);
	}
}
