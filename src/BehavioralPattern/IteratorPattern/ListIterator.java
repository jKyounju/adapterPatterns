package BehavioralPattern.IteratorPattern;

public interface ListIterator<E> extends Iterator<E> {
    E previous();
    boolean hasPrevious();
}
