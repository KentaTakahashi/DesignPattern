package Exercises.ch08_AbstractFactory.ex08_02.ListFactory;

import Exercises.ch08_AbstractFactory.ex08_02.factory.Factory;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Link;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Page;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Tray;
public class ListFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new ListLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }
    public Page createPage(String title, String author) {
        return new ListPage(title, author);
    }
}
