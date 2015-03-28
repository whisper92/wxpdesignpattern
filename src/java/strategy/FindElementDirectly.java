public class FindElementDirectly implements FindElement{

    public int find(Integer[] array,Integer e) {
        int pos = -1;
        for (int i = 0; i<array.length;i++) {
            if (e == array[i]) {
              pos = i;
            }
        }
        return pos;
    }
}
~                                                                                                                                                                                 
~                                                                                                                                                                                 
~     
