class ThreadA extends Thread{
    public void run(){
        for(int i = 5; i >=1; i--){
            System.out.println("From Thread A " + i);
        }
        System.out.println("Exiting from Thread A ...");
    }
}

class ThreadB extends Thread{
    public void run(){
        for (int j = 5; j>=1; j--){
            System.out.println("From Thread B " + j);
        }
        System.out.println("Exiting from Thread B ...");
    }
}

class ThreadC extends Thread{
    public void run(){
        for (int k =5; k>=1;k--){
            System.out.println("From Thread C " + k);
        }
        System.out.println("Exiting from Thread C ...");
    }
}
public class Multi5T1{
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
    }
}