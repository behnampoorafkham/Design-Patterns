package SE.Behavioral.Command.Commnads;

import SE.Behavioral.Command.Service.CommandExam;
import SE.Behavioral.Command.Service.Receiver;

public class DisConnect extends CommandExam {

    protected DisConnect(Receiver receiver) {
        super(receiver);
    }

    @Override
    public void execute() {
        receiver.disconnect();
    }
}
