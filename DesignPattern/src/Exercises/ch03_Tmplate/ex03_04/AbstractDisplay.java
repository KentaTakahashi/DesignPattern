package Exercises.ch03_Tmplate.ex03_04;

public interface AbstractDisplay { // 抽象クラスAbstractDisplay
    public abstract void open();        // サブクラスに実装をまかせる抽象メソッド(1) open
    public abstract void print();       // サブクラスに実装をまかせる抽象メソッド(2) print
    public abstract void close();       // サブクラスに実装をまかせる抽象メソッド(3) close
    public default void display() {       // この抽象クラスで実装しているメソッドdisplay
        open();                             // まずopenして…
        for (int i = 0; i < 5; i++) {       // 5回printを繰り返して…
            print();
        }
        close();                            // …最後にcloseする。これがdisplayメソッドで実装されている内容。
    }
}

