package driver_management;

public class Driver{

  String name;
  QuadBike quadBike;

  public Driver(String name, QuadBike quadBike) {
    this.name = name;
    this.quadBike = quadBike;
  }

  public String getName(){
    return this.name;
  }

  public int driveTime(int distance){
    return this.quadBike.driveTime(distance);
  }
}