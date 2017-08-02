package driver_management;
import behaviors.*;

public class DodgemCar implements Driveable {
  private int averageSpeed;


  public DodgemCar(int averageSpeed) {
    this.averageSpeed = averageSpeed;
  }


  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

}