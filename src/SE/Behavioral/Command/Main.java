package SE.Behavioral.Command;

import SE.Behavioral.Command.Commnads.Connect;
import SE.Behavioral.Command.ReciveImp.America;
import SE.Behavioral.Command.ReciveImp.Asia;
import SE.Behavioral.Command.ReciveImp.Europe;
import SE.Behavioral.Command.Service.CommandExam;
import SE.Behavioral.Command.Service.Receiver;
import SE.Behavioral.Command.Service.ServerInvoker;

public class Main {

    public static void main(String[] args) {

        Receiver receiver1 = new Asia();
        Receiver receiver2 = new America();
        Receiver receiver3 = new Europe();

        CommandExam connect;
        ServerInvoker serverInvoker;

        //Asia
        connect = new Connect(receiver1);
        serverInvoker = new ServerInvoker(connect);
        serverInvoker.run();

        //America
        serverInvoker.ChangeCommand(connect.ChangeReceiver(receiver2)).run();

        //Eroupe
        serverInvoker.ChangeCommand(connect.ChangeReceiver(receiver3)).run();

    }
}
