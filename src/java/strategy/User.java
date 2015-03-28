public class User {
    public static void main(String[] args) {
        FindContext context = new FindContext(new FindElementDirectly());
        int[] array = new int[]{1,2,3,4,5,6,7};
        int pos = context.executeFind(array,7);
        System.out.println("Pos :" + pos);
    }
}
