import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    Object elements[];

    MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyArrayList(int capacity) {
        elements = new Object[capacity];
    }

    public void add(int index, E element) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        ensureCapacity(size + 1);
        for (int i = size; i > index; i--) {
            elements[i] = elements[i];
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        E removeElement = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null;
        size--;
        return removeElement;
    }
    public int size(){
        return size;
    }
    public MyArrayList<E> clone(){
        MyArrayList<E> cloneList = new MyArrayList<>(size);
        for (int i=0; i<size; i++){
            cloneList.elements[i] = elements[i];
        }
        cloneList.size = size;
        return cloneList;
    }
    public boolean contains(E o){
        for(int i =0; i<size; i++){
            if(o.equals(elements[i])){
                return true;
            }
        }
        return false;
    }
    public int indexOf(E o){
        for(int i=0; i<size; i++){
            if (o.equals(elements[i])){
                return i;
            }
        }
        return -1;
    }
    public void ensureCapacity(int minCapacity){
        if(minCapacity > elements.length){
            int newCapacity = elements.length*2;
            if(newCapacity < minCapacity){
                newCapacity = minCapacity;
            }
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }
    public E get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size: " + size);
        }

        return (E) elements[i];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }

        size = 0;
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(elements[i]);
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

