package Exercises.ch07_Builder.ex07_03;

public abstract class Builder {

    private boolean isInit = false;

    public void makeTitle(String title) {
     if(!isInit) {
         init(title);
         isInit = true;
     }
    }
    public void makeString(String str) {
        if(isInit)
            doString(str);
    }
    public void makeItems(String[] items) {
        if(isInit)
            doItems(items);
    }
    public void close() {
        if(isInit)
            finish();
    }


    protected abstract void init(String title);
    protected abstract void doString(String str);
    protected abstract void doItems(String[] items);
    protected abstract void finish();
}
