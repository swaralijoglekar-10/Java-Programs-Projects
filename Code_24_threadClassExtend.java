package SwaraliPractice;

class MyThread1 extends Thread{
    public void run(){
//        while(true) {
//            System.out.println("Thread1 is running");
//        }
        int i=0;
        while(i<=2000){
            System.out.println("Thread1 is running");
            i++;
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
//        while(true) {
//            System.out.println("Thread2 is running");
//        }
        int i=0;
        while(i<=5000){
            System.out.println("Thread2 is running");
            i++;
        }
    }
}

public class Code_24_threadClassExtend {
    public static void main(String[] args) {
        MyThread1 t1= new MyThread1();
        MyThread2 t2= new MyThread2();
        t1.start();
        t2.start();

    }
}
