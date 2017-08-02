import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;


public class DriverTest {

  Driver driver;
  QuadBike ride;


  @Before
  public void before() {
    ride = new QuadBike (50, 150);
    driver = new Driver("CJ", ride);
  }

  @Test
  public void hasName() {
    assertEquals("CJ", driver.getName());
  }

  @Test
  public void canGetDriveTime() {
    assertEquals(2, driver.driveTime(100));
  }

  @Test
  public void canUpdateDriveable() {
    ride = new QuadBike(100, 200);
    driver.setRide(ride);
    assertEquals(1, driver.driveTime(100));
  }


}