package edu.kis.powp.jobs2d.drivers.command;

import java.util.List;

public class CommandComplex implements CommandDriver {

    private List<CommandDriver> myCommands;

    @Override public void execute() {
        for (int i = 0; i < myCommands.size(); i++){
            myCommands.get(i).execute();
        }
    }

    public CommandComplex(List<CommandDriver> myCommands){
        this.myCommands = myCommands;
    }

    public List<CommandDriver> getMyCommands() {
        return myCommands;
    }

    public void setMyCommands(List<CommandDriver> myCommands) {
        this.myCommands = myCommands;
    }
}
