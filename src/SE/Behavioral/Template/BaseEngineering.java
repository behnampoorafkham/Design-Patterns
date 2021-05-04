package SE.Behavioral.Template;

public abstract class BaseEngineering {
    
    public void study(){
        math();
        physics();
        additional();
    }

    public void physics() {
        System.out.println("PHYSICS");
    }

    public abstract void additional();

    public void math() {
        System.out.println("MATH");
    }
    
}
