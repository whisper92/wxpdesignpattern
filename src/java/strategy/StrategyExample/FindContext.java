public class FindContext {

    private FindElement findElement;
    public FindContext(FindElement findElement) {
        this.findElement = findElement;
    }

    public  int executeFind(int[] t,int e) {
        return this.findElement.find(t,e);
    }
}
