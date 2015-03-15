package Exercises.ch05_Singleton.ex05_01;



public class TicketMaker {
    private static TicketMaker ticketmaker= new TicketMaker();
    private int ticket = 1000;

    private TicketMaker(){System.out.println("インスタンスを生成しました。");};
    public synchronized int getNextTicketNumber() {
        return ticket++;
    }
    public static TicketMaker getInstance() {
        return ticketmaker;
    }
}

