package git;

public class ThreadT {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Jthread());
        Thread t2 = new Thread(new Othread());
        t1.setName("线程一");
        t2.setName("线程二");
        t1.start();
        t2.start();

    }
}
class Jthread implements Runnable{

    @Override
    public void run() {
        for (int i =1; i <=100 ; i++) {
            if (i%2==1){
                System.out.println(Thread.currentThread().getName()+"打印奇数"+i);
            }
        }
    }
}
class Othread implements  Runnable{

    @Override
    public void run() {
        for (int i =1; i <=100 ; i++) {
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"打印偶数"+i);
            }
        }
    }
}
