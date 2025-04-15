package pckg_lab1;

public class Car{

    private String car;
    private long odom;

    public Car(String car, long odom){
        this.car=car;
        this.odom=odom;
    }
    public void info(){
        System.out.println("Odometer: " + odom + " km, Car: " + car);

    }
    public void updateOdom(long dodatno){
        if(dodatno > 0){
            odom+=dodatno;
        }else{
            System.out.println("Must be greater than 0");
        }
    }
}