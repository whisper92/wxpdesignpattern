
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
		AbstractAlgorithmTemplate abstractQuadrant = new ConcretAlgorithm();
		abstractQuadrant.showResult(array);
	}
}
