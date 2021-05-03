package SE.Behavioral.Command.ReciveImp;

import SE.Behavioral.Command.Service.Receiver;

public class Europe implements Receiver {
    @Override
    public void connect() {
        System.out.println("connect to server europe");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect to server america");
    }
}
