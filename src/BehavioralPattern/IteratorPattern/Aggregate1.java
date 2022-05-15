package BehavioralPattern.IteratorPattern;

import java.util.NoSuchElementException;

public class Aggregate1<E> implements Aggregate<E> {
    private Object[] elementData;
    private int idx;
    private int size;

    public Aggregate1(int size) {
        if(size < 0)
            throw new IllegalArgumentException("size : " + size);
        this.size = size;
        this.elementData = new Object[size];
    }

    @Override
    public Iterator<E> createIterator() {
        return new Iterator1<E>();
    }

    @Override
    public boolean add(Object element) {
        if(idx < size) {
           elementData[idx++] = element;
           return true;
        }
        return false;
    }

    private class Iterator1<E> implements Iterator<E> {
        private int cursor = 0;

        @Override
        public E next() {
            if(cursor >= size )
                throw new NoSuchElementException();
            return (E) elementData[cursor++];
        }

        @Override
        public boolean hasNext() {
            return cursor < size;
        }
    }

}
