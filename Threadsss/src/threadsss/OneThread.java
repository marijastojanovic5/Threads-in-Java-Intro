package threadsss;
public class OneThread extends Thread
        
{   static long count =0;

    public OneThread() {
        this.start();
    }
    public static long returnCount(){
        return count;
    }
    @Override
    public synchronized void run(){
        increase();
           // System.out.println(i+" "+this);
        }
        
    
    public void increase(){
         for(int i=1;i<=10000;i++)
            count++;
        
    }
    

    @Override
    public String toString() {
        return "OneThread{" + this.getId()+'}';
    }
    
}
