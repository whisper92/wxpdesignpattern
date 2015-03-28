public class FindElementDichotomy implements FindElement {
    
    @Override
    public int find(int[] array,int e) {
        int pos = -1;
        for (int i = 0; i<array.length;i++) {
            if (e == array[i]) {
              pos = i;
            }
        }
        return pos;
    }
}
