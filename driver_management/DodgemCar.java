package driver_management;
import behaviors.*;

public class DodgemCar implements Driveable {
  private int averageSpeed;
  private int seatCount;


  public DodgemCar(int averageSpeed, int seatCount) {
    this.averageSpeed = averageSpeed;
    this.seatCount = seatCount;
  }

  public int driveTime(int distance) {
    return distance/this.averageSpeed;
  }

  public int getWheels() {
    return this.seatCount;
  }

}