import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DodgemCarTest {

  DodgemCar car;


  @Before
  public void before() {
    car = new DodgemCar(10, 4);
  }

  @Test
  public void driveTime() {
    assertEquals(10, car.driveTime(100));
  }

  @Test
  public void hasFourWheels() {
    assertEquals(4, car.getWheels());
  }


}