package stock;
/*
 tests the Stock class by
 verifying its constructor and getter methods.
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StockTest {

  @Test
  public void testStockCreation() {
    Stock stock = new Stock("AAPL", "Apple Inc.", 150.0);
    assertEquals("AAPL", stock.getSymbol());
    assertEquals("Apple Inc.", stock.getName());
    assertEquals(150.0, stock.getCostBasis());
  }
}
