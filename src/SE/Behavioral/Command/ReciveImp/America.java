package SE.Behavioral.Command.ReciveImp;

import SE.Behavioral.Command.Service.Receiver;

public class America implements Receiver {
    @Override
    public void connect() {
        System.out.println("connect to server america");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect to server america");
    }
}
