package Exercises.ch05_Singleton.ex05_03;

import org.junit.Test;

public class SingletonTest {

    static Singleton obj1;
    static Singleton obj2;
    static ExThread1 thread_1 = new ExThread1();
    static ExThread2 thread_2 = new ExThread2();


    @Test
    public void test() {
        for(int i = 0; i < 100; i++) {
            System.out.println("i = " + i);
            thread_1.start();
            thread_2.start();
            compareInstance(obj1, obj2);
            Singleton.delInstance();
        }
    }

    private static class ExThread1 extends Thread{
        public void run() {obj1 = Singleton.getInstance();}
    }
    private static class ExThread2 extends Thread{
        public void run() {obj2 = Singleton.getInstance();}
    }

    private static void compareInstance(Object obj_a, Object obj_b) {
        if (obj_a == obj_b) {
            //System.out.println("比較結果：同じインスタンスです。");
        } else {
            System.out.println("比較結果：同じインスタンスではありません。");
        }

    }
}
