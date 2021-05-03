package SE.Behavioral.Command.ReciveImp;

import SE.Behavioral.Command.Service.Receiver;

public class Asia implements Receiver {
    @Override
    public void connect() {
        System.out.println("connect to server asia");
    }

    @Override
    public void disconnect() {
        System.out.println("disconnect to server asia");
    }
}
