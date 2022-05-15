package BehavioralPattern.IteratorPattern;

public interface Aggregate<E> {
    Iterator<E> createIterator();
    boolean add(E element);
}
