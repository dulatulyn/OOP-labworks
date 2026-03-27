package labwork3.problem3;

import java.util.Iterator;

public interface MyCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    boolean remove(Object o);
    void clear();
    Iterator<E> iterator();
    Object[] toArray();
}
