package command;

public class KitchenRoomLightOnCommand implements Command {
    Light light;

    public KitchenRoomLightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
