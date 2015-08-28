
/*基于方形画圆形的适配器*/
public class DrawCircleAdapter extends Square implements DrawBitmap
{

	/*重载父类的drawCircle方法,此时画出来的是一个圆*/
	@Override
	public void drawCircle(int radius){
		System.out.println("drawCircle...radius is : "+radius);
	}
}
