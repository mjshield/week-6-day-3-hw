import static org.junit.Assert.*;
import org.junit.*;
import driver_management.*;

public class QuadBikeTest {

  QuadBike quadBike;


  @Before
  public void before() {
    quadBike = new QuadBike(50, 150);
  }

  @Test
  public void driveTime() {
    assertEquals(2, quadBike.driveTime(100));
  }

  @Test
  public void hasEngineCapacity() {
    assertEquals(150, quadBike.getEngineCapacity());
  }


}