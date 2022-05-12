package BehavioralPattern.CommandPattern;

public class Invoker {
    private Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void operation() {
        System.out.println("Invoker : Calling execute on the installed command ...");
        command.execute();
    }
}
