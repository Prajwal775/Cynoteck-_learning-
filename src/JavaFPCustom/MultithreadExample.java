package JavaFPCustom;

public class MultithreadExample {

    public static void main(String[] args) {

         Runnable runnable=new Runnable() {
             @Override
             public void run() {
                 for (int i=0;i<=100;i++)
                     System.out.println(Thread.currentThread().getId() + " " + i);
             }
         };

         Runnable runnable1=()->{
             for (int i=0;i<=100;i++)
                 System.out.println(Thread.currentThread().getId() + " " + i);
         };

        Thread thread = new Thread(runnable1);
        thread.start();
        Thread thread1 = new Thread(runnable1);
        thread1.start();
        Thread thread2 = new Thread(runnable1);
        thread2.start();
    }
}
