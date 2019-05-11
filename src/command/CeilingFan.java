package command;

public class CeilingFan {
    private boolean isHigh = false;
    public void  high(){
        isHigh = true;
        System.out.println("CeilingFan is "+isHigh);
    }

    public void low(){
        isHigh = false;
        System.out.println("CeilingFan is "+isHigh);
    }
}
