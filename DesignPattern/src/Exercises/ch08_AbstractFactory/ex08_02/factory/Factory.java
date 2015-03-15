package Exercises.ch08_AbstractFactory.ex08_02.factory;

public abstract class Factory {
    public static Factory getFactory(String classname) {
        Factory factory = null;
        try {
            factory = (Factory)Class.forName(classname).newInstance();
        } catch (ClassNotFoundException e) {
            System.err.println("クラス " + classname + " が見つかりません。");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return factory;
    }
    public abstract Link createLink(String caption, String url);
    public abstract Tray createTray(String caption);
    public abstract Page createPage(String title, String author);
    public Page createYahooPage() {
        String title = "Yahoo!";
        String author = "Yahoo!";
        Page page = createPage(title, author);

        Link us_yahoo = this.createLink("Yahoo!", "http://www.yahoo.com/");
        page.add(us_yahoo);

        return page;
    }
}
