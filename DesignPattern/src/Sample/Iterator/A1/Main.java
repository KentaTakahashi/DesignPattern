package Sample.Iterator.A1;



public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));
        bookShelf.appendBook(new Book("East of Eden"));
        bookShelf.appendBook(new Book("Frankenstein"));
        bookShelf.appendBook(new Book("Gulliver's Travels"));
        bookShelf.appendBook(new Book("Hamlet"));

        for(Book book:bookShelf)
            System.out.println(book.getName());

        /*
         * メモ
         * 本書発行後のJava1.5で追加された下記機能を踏まえてコードをリファクタリング
         * ・拡張For文とIterableインターフェースの採用
         * ・パラメータ化
         *
         * 要は、Iteratorパターンを自前で準備する必要がなくなり、
         * Javaの言語レベルでサポートされるようになった(型安全性も保障してくれる)
         */

        /* リファクタリング前
        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println(book.getName());
        }

        他にもAggregateクラスとIteratorクラスは削除して
        Book系の実装クラスもパラメータ化したりしてる
        */
    }
}
