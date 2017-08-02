import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class DriverTest {

  Driver driver;
  QuadBike quadBike;


  @Before
  public void before() {
    quadBike = new QuadBike (50, 150);
    driver = new Driver("CJ", quadBike);
  }

  @Test
  public void hasName() {
    assertEquals("CJ", driver.getName());
  }

  @Test
  public void canGetDriveTime() {
    assertEquals(2, driver.driveTime(100));
  }


}