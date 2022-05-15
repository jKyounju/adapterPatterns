package BehavioralPattern.IteratorPattern;


public interface List<E> extends Collection<E> {
    ListIterator<E> listIterator();
    ListIterator<E> listIterator(int idx);

    E get(int idx);
    E set(int idx, E element);
    int indexOf(Object o);
}
