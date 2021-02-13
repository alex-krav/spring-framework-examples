package org.example.lookup;

public abstract class CommandManagerLookup {

    public void process() {
        MyCommand command = createCommand();
        long time = command.execute();
        System.out.println(time);
    }

    protected abstract MyCommand createCommand();
}