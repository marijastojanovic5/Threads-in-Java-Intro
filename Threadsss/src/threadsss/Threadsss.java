package threadsss;
public class Threadsss {
    public static void main(String[] args) {
        
        OneThread thread=new OneThread();
        OneThread thread1=new OneThread();
        OneThread thread2=new OneThread();
        OneThread thread4=new OneThread();
        System.out.println(OneThread.returnCount());

    }
}
