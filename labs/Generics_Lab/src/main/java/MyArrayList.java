import java.util.Collection;

/**
 * Created by latashawatson on 2/22/17.
 */
public class MyArrayList<E> extends DataStructureTemplate<E> {


    public MyArrayList() {
        super.collection = new Object[0];
    }

    public MyArrayList(int size) {
        super.collection = new Object[size];
    }

    private void resize(int scaleAmount) {
        int newIndex = super.collection.length + scaleAmount;
        Object[] newArray = new Object[newIndex];
        for (int i = 0; i < super.collection.length; i++) {
            newArray[i] = super.collection[i];
        }
        super.collection = newArray;
    }

    public boolean add(E element) {
        resize(1);
        super.collection[super.collection.length - 1] = element;
        return true;
    }

    public void add(int index, E element) {
        int newIndex = super.collection.length + 1;
        Object[] newArray = new Object[newIndex];
        int j = 0;
        for (int i = 0; i < super.collection.length; i++) {
            if (index == i) {
                newArray[i] = element;
                j++;
            } else {
                newArray[j] = super.collection[i];
            }
            j++;
        }
        super.collection = newArray;
    }

    public boolean addAll(Collection<? extends E> c) {
        int numberOfAdditionalPositions = c.size();
        int nextOpenPosition = super.collection.length;
        resize(numberOfAdditionalPositions);
        for(E element: c) {
            super.collection[nextOpenPosition] = element;
            nextOpenPosition++;
        }
        return true;
    }

    public boolean contains(E element) {
        for (E collectionElement : (E[]) super.collection) {
            if (collectionElement.equals(element)) {
                return true;
            }
        }
        return false;
    }


    public E get(int index) {
        Object object = super.collection[index];
        return (E) object;
    }

    public void remove(int index) {
        int newIndex = super.collection.length - 1;
        Object[] newArray = new Object[newIndex];
        int j = 0;
        for (int i = 0; i < super.collection.length; i++) {
            if (index == i) {
                j--;
            } else {
                newArray[j] = super.collection[i];
            }
            j++;
        }
        super.collection = newArray;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void removeAll(Collection<E> c){
        for(int i = 0; i < c.size(); i++) {
            if(c.contains(super.collection[i])) {
                remove(i);
            }
        }
    }

    public void set(int index, E element) {
        super.collection[index] = element;
    }
}
