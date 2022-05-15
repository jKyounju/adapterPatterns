package BehavioralPattern.IteratorPattern;

public interface Collection<E> extends Iterator<E> {
    int size();
    boolean isEmpty();
    boolean contain(Object o);
    Iterator<E> iterator();
    boolean add(E e);
    boolean remove(Object o);

}
