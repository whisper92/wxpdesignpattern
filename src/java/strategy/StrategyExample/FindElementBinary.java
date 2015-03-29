public class FindElementBinary implements FindElement {

    @Override
    public  int find(int[] array,int e) {
        int pos = -1;

        int length = array.length;

        int low = 0;
        int high = length-1;
        
        while ( low<=high && low<=(length-1) && high<=(length-1)) {
          int mid = (low+high)/2;
          if ( e == array[mid]) {
            pos = mid;
            return pos;
          } else if ( e < array[mid]) {
            high = mid -1;
          } else {
            low = mid+1;
          }
        }

        return pos;

    }
}
