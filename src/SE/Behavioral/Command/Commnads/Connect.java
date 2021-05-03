package SE.Behavioral.Command.Commnads;

import SE.Behavioral.Command.Service.CommandExam;
import SE.Behavioral.Command.Service.Receiver;

public class Connect extends CommandExam {


    public Connect(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.connect();
    }
}
