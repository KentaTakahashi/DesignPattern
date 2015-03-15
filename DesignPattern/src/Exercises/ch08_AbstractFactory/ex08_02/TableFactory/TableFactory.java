package Exercises.ch08_AbstractFactory.ex08_02.TableFactory;

import Exercises.ch08_AbstractFactory.ex08_02.factory.Factory;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Link;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Page;
import Exercises.ch08_AbstractFactory.ex08_02.factory.Tray;

public class TableFactory extends Factory {
    public Link createLink(String caption, String url) {
        return new TableLink(caption, url);
    }
    public Tray createTray(String caption) {
        return new TableTray(caption);
    }
    public Page createPage(String title, String author) {
        return new TablePage(title, author);
    }
}
