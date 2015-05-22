
public abstract class AbstractAlgorithmTemplate {

	  protected abstract void sortContent(int[] array);
    protected abstract int findElement(int[] array,int e);
	  public void showResult(int[] array) {
		    System.out.println("排序开始 ：");
		    sortContent(array);
		    int pos = findElement(array,2);
		    System.out.println("搜索元素 ： 2"+" ； 位置为 ： "+pos);
	  }

}
