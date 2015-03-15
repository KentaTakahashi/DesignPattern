package Exercises.ch05_Singleton.ex05_02;

public class Main {
    public static void main(String[] args) {
        Triple obj0 = Triple.getInstance(0);
        Triple obj1 = Triple.getInstance(1);
        Triple obj2 = Triple.getInstance(2);
        Triple obj0_2 = Triple.getInstance(0);

        System.out.println("obj0とobj1のインスタンスを比較します");
        compareInstance(obj0, obj1);
        System.out.println("obj1とobj2のインスタンスを比較します");
        compareInstance(obj1, obj2);
        System.out.println("obj2とobj0のインスタンスを比較します");
        compareInstance(obj2, obj0);

        System.out.println("obj0とobj0_2のインスタンスを比較します");
        compareInstance(obj0, obj0_2);
    }
    private static void compareInstance(Object obj_a, Object obj_b) {
        System.out.println("compareInstance Start.");
        if (obj_a == obj_b) {
            System.out.println("比較結果：同じインスタンスです。");
        } else {
            System.out.println("比較結果：同じインスタンスではありません。");
        }
        System.out.println("compareInstance End.");

    }
}
