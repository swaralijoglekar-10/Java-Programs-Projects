package SwaraliPractice;

class ThreadRunnable1 implements Runnable{
    public void run(){
        int i=0;
        while(i<=1000) {
            System.out.println("Thread 1");
            i++;
        }
    }
}

class ThreadRunnable2 implements Runnable{
    public void run(){
        int i=0;
        while(i<=1000) {
            System.out.println("Thread 2");
            i++;
        }
        }
}

public class Code_25_threadRunnableInterfaceImplement {
    public static void main(String[] args) {
        ThreadRunnable1 bullet1=  new ThreadRunnable1();
        ThreadRunnable2 bullet2= new ThreadRunnable2();
        Thread Gun1= new Thread(bullet1);
        Thread Gun2= new Thread(bullet2);
        Gun1.start();
        Gun2.start();

    }
}
