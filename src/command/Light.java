package command;

public class Light {
    private boolean isOn = false;
    private String place;
    public Light(String place){
        this.place = place;
    }
    public void  on(){
        isOn = true;
        System.out.println(place+"Light is "+isOn);
    }

    public void off(){
        isOn = false;
        System.out.println(place+"Light is "+isOn);
    }

}
