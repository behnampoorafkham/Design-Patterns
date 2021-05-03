package SE.Behavioral.Memento;

public class Main {
      
    public static void main(String[] args) {  
          
          Originator originator = new Originator();  
            
          Caretaker careTaker = new Caretaker();  
            
          originator.setState("State #1");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #2");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #3");  
          careTaker.add(originator.saveStateToMemento());  
          originator.setState("State #4");
          careTaker.add(originator.saveStateToMemento());


          System.out.println("Current:"+originator.getState());
          originator.getStateFromMemento(careTaker.get());
          System.out.println(originator.getState());
          originator.getStateFromMemento(careTaker.get());
          System.out.println(originator.getState());
          originator.getStateFromMemento(careTaker.get());
          System.out.println(originator.getState());
       }  
  
}  