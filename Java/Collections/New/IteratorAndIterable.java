import java.util.*;

class OurGenericList<T> implements Iterable<T>
{
    private T[] items;
    private int size;

    @SuppressWarnings("unchecked")
    public OurGenericList()
    {
        size = 0;
        items = (T[]) new Object[100];
    }

    public void add(T item)
    {
        items[size++] = item;
    }
    
    public T getItemAtIndex(int index)
    {
        return items[index];
    }

    @Override
    public Iterator<T> iterator()
    {
        return new OurGenericListIterator(this);
    }

    class OurGenericListIterator implements Iterator<T>
    {
        private OurGenericList<T> list;
        private int index = 0;

        public OurGenericListIterator(OurGenericList<T> list)
        {
            this.list = list;
        }

        @Override
        public boolean hasNext()
        {
            System.out.println("hasNext() called");
            return index < list.size;
        }

        @Override
        public T next()
        {
            System.out.println("next() called");
            return list.items[index++];
        }
    }
}

public class IteratorAndIterable {
    public static void main(String[] args) {
        @SuppressWarnings({ "unchecked", "rawtypes" })
        OurGenericList<Integer> list = new OurGenericList();
        list.add(1);
        list.add(2);
        list.add(3);

        for(int n : list) System.out.println(n);
    }
}