package Exercises.ch08_AbstractFactory.ex08_02.TableFactory;


import Exercises.ch08_AbstractFactory.ex08_02.factory.Link;
public class TableLink extends Link {
    public TableLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "<td><a href=\"" + url + "\">" + caption + "</a></td>\n";
    }
}
