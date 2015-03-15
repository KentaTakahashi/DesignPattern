package Exercises.ch05_Singleton.ex05_02;



public class Triple {
    private static Triple id_0 = new Triple(0);
    private static Triple id_1 = new Triple(1);
    private static Triple id_2 = new Triple(2);
    private int id;

    private Triple(int id){
        this.id = id;
        System.out.println("インスタンスを生成しました。ID:" + id);
    }
    public int getId() {
        return id;
    }
    public static Triple getInstance(int id) {
       switch (id) {
       case 0:
           return id_0;
       case 1:
           return id_1;

       case 2:
           return id_2;
       default:
           return null;
       }
    }
}

