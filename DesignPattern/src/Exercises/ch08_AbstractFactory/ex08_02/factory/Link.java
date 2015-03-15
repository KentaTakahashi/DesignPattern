package Exercises.ch08_AbstractFactory.ex08_02.factory;

public abstract class Link extends Item {
    protected String url;
    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}
