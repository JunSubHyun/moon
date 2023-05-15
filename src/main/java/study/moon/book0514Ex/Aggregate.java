package study.moon.book0514Ex;


import java.util.Iterator;

public interface Aggregate<T> {
    Iterator<T> iterator();
}
