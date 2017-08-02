package driver_management;
import behaviors.*;

public class Driver{

  String name;
  Driveable ride;

  public Driver(String name, Driveable ride) {
    this.name = name;
    this.ride = ride;
  }

  public String getName(){
    return this.name;
  }

  public int driveTime(int distance){
    return this.ride.driveTime(distance);
  }

  public void setRide(Driveable ride){
    this.ride = ride;
  }

}