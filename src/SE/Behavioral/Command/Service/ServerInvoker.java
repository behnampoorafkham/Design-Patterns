package SE.Behavioral.Command.Service;

public class ServerInvoker {

    public ServerInvoker ChangeCommand(CommandExam commandExam) {
        this.commandExam = commandExam;
        return this;
    }

    private CommandExam commandExam;


    public ServerInvoker(CommandExam commandExam) {
        this.commandExam = commandExam;
    }

    public void run(){
        commandExam.execute();
    }
}
