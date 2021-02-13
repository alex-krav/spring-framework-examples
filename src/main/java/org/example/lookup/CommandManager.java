package org.example.lookup;

public class CommandManager {

    private MyCommand myCommand;

    public void process() {
        long time = myCommand.execute();
        System.out.println(time);
    }

    public void setMyCommand(MyCommand myCommand) {
        this.myCommand = myCommand;
    }
}