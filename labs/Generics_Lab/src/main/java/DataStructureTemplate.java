/**
 * Created by latashawatson on 2/22/17.
 */
public class DataStructureTemplate<E> {
    protected Object[] collection;

    public DataStructureTemplate() {
        collection = new Object[0];
    }

    public void clear() {
        collection = new Object[0];
    }

    public boolean isEmpty() {
        boolean reflect = true;
        for (Object element : collection) {
            if (element != null) {
                reflect = false;
            }
        }
        return reflect;
    }

    public int size() {
        return collection.length;
    }

}
