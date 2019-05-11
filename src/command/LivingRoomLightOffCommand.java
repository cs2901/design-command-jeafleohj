package command;

public class LivingRoomLightOffCommand implements Command{
    Light light;

    public LivingRoomLightOffCommand(Light light) {
        this.light = light;
    }
    @Override
    public void execute() {
        light.off();
    }
}
