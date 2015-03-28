public class FindContext<T[],P> {

    private FindElement findElement;
    public FindContext(FindElement findElement) {
        this.findElement = findElement;
    }

    public int executeFind(T[] t,P p) {
        this.findElement.find(t,p);
    }
}
