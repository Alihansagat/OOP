package lab3.problem3;

import java.util.ArrayList;

public class MyArrayCollection<T> implements MyCollection<T>{
    private ArrayList<T> elements = new ArrayList<>();

    @Override
    public void add(T element) {
        elements.add(element);
    }

    @Override
    public void remove(T element) {
        elements.remove(element);
    }

    @Override
    public boolean contains(T element) {
        return elements.contains(element);
    }

    @Override
    public int size() {
        return elements.size();
    }

    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    @Override
    public void clear() {
        elements.clear();
    }
}
