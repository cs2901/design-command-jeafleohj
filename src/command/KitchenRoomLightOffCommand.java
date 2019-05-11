package command;

public class KitchenRoomLightOffCommand implements Command{
    Light light;

    public KitchenRoomLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
