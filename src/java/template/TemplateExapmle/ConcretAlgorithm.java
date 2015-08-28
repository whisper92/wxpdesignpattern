
public class ConcretAlgorithm extends AbstractAlgorithmTemplate {

	  @Override
	  protected void sortContent(int[] a) {
        //这里采用选择排序
				int minIndex=0;
				int temp=0;
				if((a==null)||(a.length==0))
				    return;
				for (int i=0;i<a.length-1;i++) {
				    minIndex=i;//无序区的最小数据数组下标
						for (int j=i+1;j<a.length;j++) {
								//在无序区中找到最小数据并保存其数组下标
								if(a[j]<a[minIndex])
								{
								    minIndex=j;
								}
						}
						if(minIndex!=i) {
								//如果不是无序区的最小值位置不是默认的第一个数据，则交换之。
								temp=a[i];
								a[i]=a[minIndex];
								a[minIndex]=temp;
						}
						printArray(a);
						System.out.println("");
				}

	  }

		protected int findElement(int[] array,int e) {
        //这里采用二分搜索
				int l = 0,h = array.length-1;
				int m = (l+h)/2;
				int pos = -1;
				while (l<h) {
				    m = (l+h)/2;
				    if(array[m]<e) {
			        	l = m+1;
				    } else if (array[m]>e) {
				        h = m-1;
				    } else {
				        return m;
				    }
				}

				return pos;
		}

  	private static void printArray(int[] array) {
				for (int i = 0; i < array.length; i++){
				    System.out.printf("%3s", array[i]);
				}
	  }
}
