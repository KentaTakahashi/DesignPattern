package Exercises.ch05_Singleton.ex05_03;

public class Main extends Thread{
    public Main(String name) {
        super(name);
    }

    public static void main(String[] args) {
        for(int i = 0; i < 100; i++) {
            System.out.println("Test " + i + "回目");
            new Main("A").start();
            new Main("B").start();
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Singleton.delInstance();
        }
    }

    public void run() {
        try {
            sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Singleton obj = Singleton.getInstance();
        System.out.println(getName() + ": obj = " + obj);
    }
}
