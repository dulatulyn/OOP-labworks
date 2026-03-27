package labwork3.problem3;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> implements MyCollection<E> {
    private Object[] data;
    private int count;

    public MyArrayList() {
        data = new Object[10];
        count = 0;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(o)) return true;
        }
        return false;
    }

    @Override
    public boolean add(E e) {
        if (count == data.length) grow();
        data[count++] = e;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < count; i++) {
            if (data[i].equals(o)) {
                    System.arraycopy(data, i + 1, data, i, count - i - 1);
                data[--count] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        for (int i = 0; i < count; i++) data[i] = null;
        count = 0;
    }

    @Override
    public Object[] toArray() {
        Object[] result = new Object[count];
        System.arraycopy(data, 0, result, 0, count);
        return result;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < count;
            }

            @Override
            public E next() {
                if (!hasNext()) throw new NoSuchElementException();
                return (E) data[index++];
            }
        };
    }

    private void grow() {
        Object[] bigger = new Object[data.length * 2];
        System.arraycopy(data, 0, bigger, 0, data.length);
        data = bigger;
    }
}
