public class Client {
    public static void main(String[] args) {
        FindContext contextDirectly = new FindContext(new FindElementDirectly());
        FindContext contextBinary = new FindContext(new FindElementBinary());
        int[] array = new int[]{1,2,3,4,5,6,7};
        //String[] strs = new String[]{ "a" , "b" , "c" , "d", "e"};
        int posDirectly = contextDirectly.executeFind(array,7);
        int posBinary = contextBinary.executeFind(array,5);

        System.out.println("Directly --> Pos :" + posDirectly);
        System.out.println("Binary --> Pos :" + posBinary);
    }
}
