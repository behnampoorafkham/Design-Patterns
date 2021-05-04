package SE.Behavioral.Observer;

abstract class Observer {
    protected Subject subject;
    public abstract void update();
}