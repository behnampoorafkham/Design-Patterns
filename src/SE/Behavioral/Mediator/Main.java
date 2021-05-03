package SE.Behavioral.Mediator;

import SE.Behavioral.Mediator.Apna.ApnaChatRoom;
import SE.Behavioral.Mediator.Apna.ApnaChatRoomImpl;
import SE.Behavioral.Mediator.Users.User1;
import SE.Behavioral.Mediator.Users.User2;

public class Main {
      
    public static void main(String args[])  
    {  
          
          ApnaChatRoom chat = new ApnaChatRoomImpl();
      
          User1 u1=new User1(chat);
          u1.setname("Ashwani Rajput");  
          u1.sendMsg("Hi Ashwani! how are you?");  
        
                
          User2 u2=new User2(chat);
          u2.setname("Soono Jaiswal");  
          u2.sendMsg("I am Fine ! You tell?");  
    }  
  
}