import java.util.NoSuchElementException;
import java.util.Scanner;

public class DoublyLinkedList<T> extends SinglyLinkedList<T>
{
    static class Entry<E> extends SinglyLinkedList.Entry<E>
    {
        Entry<E> prev;

        Entry(E x, Entry<E> next, Entry<E> prev)
        {
            super(x, next);
            this.prev = prev;
        }
    }

    public DoublyLinkedList()
    {
        head = new Entry<>(null,null, null);
        tail = head;
        size = 0;
    }

    public DLLIterator dllIterator()
    {
        return new DLLIterator();
    }

    public class DLLIterator extends SLLIterator
    {
        DLLIterator()
        {
            super();
        }

        @Override
        public void remove()
        {
            if (ready == false)
                throw new NoSuchElementException();
            if (cursor != tail)
                ((Entry)cursor.next).prev = ((Entry)cursor).prev;
            super.remove();
            return;
        }

        public boolean hasPrev()
        {
            if (((Entry)cursor).prev == head || ((Entry)cursor).prev == null )
                throw new NoSuchElementException();
            return true;
        }

        public T prev() {
            cursor = ((Entry)cursor).prev;
            ready = true;
            if(cursor == head)
                ready = false;

            prev=((Entry) prev).prev;
            return cursor.element;
        }

        // Add new elements
        public void add(T x)
        {
            add(new Entry<>(x, null, null));
        }

        public void add(Entry<T> ent)
        {
            ent.next = cursor.next;
            cursor.next = ent ;
            ent.prev = ((Entry)cursor);
            prev = cursor;
            if (cursor != tail)
                ((Entry<T>) ent.next).prev = ent;
            else
                tail = ent;
            cursor = cursor.next;
            ready = false;
            size++;
        }
    }

    @Override
    public void add(T x)
    {
        add(new Entry<T>(x, null, (Entry<T>) tail));
    }

    public static void main(String[] args) throws NoSuchElementException
    {
        DoublyLinkedList<Integer> lst = new DoublyLinkedList<>();
        DoublyLinkedList.DLLIterator d1 = lst.dllIterator();

        // adding elements in the Linked list
        lst.add(10);
        lst.add(12);
        lst.add(13);
        lst.add(14);
        lst.add(15);

        Scanner in = new Scanner(System.in);
        whileloop:
        while(in.hasNext()) {
            int com = in.nextInt();
            switch(com) {
                case 1:  // Move to next element and print it
                    if (d1.hasNext()) {
                        System.out.println( d1.next());
                    } else {
                        break whileloop;
                    }
                    break;
                case 2: // insert x before the element that will be returned by a call to next()
                    System.out.println("Enter the value of element:");
                    int val = in.nextInt();
                    d1.add(Integer.valueOf(val));
                    lst.printList();
                    break;
                case 3: // remove element and print the linked list
                    d1.remove();
                    lst.printList();
                    break;
                case 4: // Move to previous element and print it
                    if (d1.hasPrev())
                        System.out.println(d1.prev());
                    else
                        break whileloop;
                    break;
                case 5: // print list
                    lst.printList();
                default:  // Exit loop
                    break whileloop;
            }
        }
    }
}