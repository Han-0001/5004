package stock;
/* defines a Stock class to represent methods for
   accessing and modifying values,calculating
   percentage change,
   and generating a formatted string representation.
 */
public class Stock {
  private String name;
  private String symbol;
  private double cost_Basis;
  private double CurrentPrice;

  public Stock(String symbol, String name, double cost_Basis) {
    this.symbol = symbol;
    this.name = name;
    this.cost_Basis = cost_Basis;
  }

  public String getName() { return name; }
  public String getSymbol() { return symbol; }
  public double getCostBasis() { return cost_Basis; }
  public double getCurrentPrice() { return CurrentPrice; }

  public void setCostBasis(double cost_Basis) { this.cost_Basis = cost_Basis; }
  public void setCurrentPrice(double CurrentPrice) { this.CurrentPrice = CurrentPrice; }

  public double getChangePercent() {
    return (CurrentPrice - cost_Basis) / cost_Basis;
  }

  public String toString() {
    return String.format("%s Current Price: $ %.2f\n Gain/Loss: %.2f%%",
        name, CurrentPrice, getChangePercent() * 100);
  }
}
