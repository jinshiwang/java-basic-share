package com.renren;

/**
 * Created by Administrator on 2017/9/14.
 */
public class ListIteratorTest {
    private final static int LIST_SIZE = 5000;

    public static void main(String[] args)
    {
        Nodes<Integer> head = new Nodes<Integer>(null,0,null);
        Nodes<Integer> first = new Nodes<Integer>(null,1,null);
        Nodes<Integer> second = new Nodes<Integer>(null,2,null);
        head.setNext(first);
        first.setPrev(head);
        first.setNext(second);
        second.setPrev(first);
        second.setNext(null);
        //先排序，再输出
        //1.排序
        //2.输出
        forEach(second);
    }

    public static <D> Nodes<D> sort(Nodes<D> nodes){
        for (Nodes<D> x = nodes; x != null; x = x.next){
              Nodes<D> next =  x.getNext();
              next.setPrev(x);
        }
        return null;
    }

    public static <T> void forEach(Nodes<T> nodes){
        if(nodes==null)
            return;
        for (Nodes<T> x = nodes; x != null; x = x.prev){
                System.out.println(x.getItem());
        }

    }
}

class Nodes<D>{
    D item;
    Nodes<D> next;
    Nodes<D> prev;

    Nodes(Nodes<D> prev, D element, Nodes<D> next) {
        this.item = element;
        this.next = next;
        this.prev = prev;
    }

    public D getItem() {
        return item;
    }

    public void setItem(D item) {
        this.item = item;
    }

    public Nodes<D> getNext() {
        return next;
    }

    public void setNext(Nodes<D> next) {
        this.next = next;
    }

    public Nodes<D> getPrev() {
        return prev;
    }

    public void setPrev(Nodes<D> prev) {
        this.prev = prev;
    }
}
