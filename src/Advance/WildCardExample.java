package Advance;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

// here T should either be Number or its subclasses

public class WildCardExample<T extends Number> {


    private Object[] data;
    private static int DEFAULT_SIZE =10;
    private int size=0;

    public WildCardExample() {
        data=new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends  Number>list)
    {
        //do a task
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp=new Object[data.length*2];

        //copy the current elements in the new array
        for(int i=0;i< data.length;i++)
        {
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull() {
        return size== data.length;
    }
 public T remove(){
        T remove=(T)(data[--size]);
        return remove;
 }
    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildCardExample list = new WildCardExample<>();

        ArrayList<Integer>list2 =new ArrayList<>();
        WildCardExample<Integer> list3 = new WildCardExample<>();
        for (int i = 0; i < 14; i++) {
            list3.add(2 * i);
        }

        System.out.println(list3);

    }
}