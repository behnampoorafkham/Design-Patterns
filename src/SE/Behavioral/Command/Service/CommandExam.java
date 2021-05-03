package SE.Behavioral.Command.Service;

public abstract class CommandExam {


    public CommandExam ChangeReceiver(Receiver receiver) {
        this.receiver = receiver;
        return this;
    }

    protected Receiver receiver;


    protected CommandExam(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
