package command;

public class CeilingFanLowCommand implements Command{
    CeilingFan ceilingFan;
    public CeilingFanLowCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    @Override
    public void execute() {
        ceilingFan.low();
    }
}
