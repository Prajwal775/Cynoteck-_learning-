package Advance;

public class CustomArrayListExample {
    private int[] data;
    private  static int Default_size=10;
    private int size=0;

    public CustomArrayListExample(int[] data) {
        this.data = new int[Default_size];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp=new int[data.length*2];

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

    public static void main(String[] args) {

    }
}
