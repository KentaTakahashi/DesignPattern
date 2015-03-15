package Exercises.ch08_AbstractFactory.ex08_02.ListFactory;

import Exercises.ch08_AbstractFactory.ex08_02.factory.Link;
public class ListLink extends Link {
    public ListLink(String caption, String url) {
        super(caption, url);
    }
    public String makeHTML() {
        return "  <li><a href=\"" + url + "\">" + caption + "</a></li>\n";
    }
}
