package SE.Behavioral.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {

    private int number=-1;
    private List<Memento> mementoList = new ArrayList<Memento>();
  
       public void add(Memento state){
          number++;
          mementoList.add(state);  
       }  
  
       public Memento get(){
          Memento memento = mementoList.get(number);
          number--;
          return memento;
       }

      public Memento current(){
         return mementoList.get(number);
   }

}