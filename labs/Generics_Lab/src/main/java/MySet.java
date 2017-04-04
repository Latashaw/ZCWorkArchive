import java.util.Collection;
import java.util.Iterator;

/**
 * Created by latashawatson on 2/22/17.
 */
public class MySet <E> extends MyArrayList<E> {

    public boolean containsAll(Collection<?> c) {
        return false;
    }

    public int hashcode() {
        return 0;
    }

    public Iterator<E> iterator() {
        return null;
    }

    public boolean retainAll(Collection<?> c) {
        return false;
    }

    public Object[] toArray() {
        return null;
    }

}
