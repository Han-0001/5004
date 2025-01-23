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

  public Stock(String name, String symbol,double cost_Basis) {
    this.name = name;
    this.symbol = symbol;
    this.cost_Basis = cost_Basis;
  }

  // SETTER METHODS AND GETTER METHODS
  public String getName() {return name; }
  public String getSymbol() {return symbol; }
  public double getCostBasis() {return cost_Basis; }
  public double getCurrentPrice() {return CurrentPrice; }

  public void setCostBasis(double cost_Basis) {
    this.cost_Basis = cost_Basis; }
  public void setCurrentPrice(double CurrentPrice) {
    this.CurrentPrice = CurrentPrice;
  }

  // Calculation method to get the percentage change
  public double getChangePercent() {
    return (CurrentPrice-cost_Basis)/cost_Basis;
  }

  // String representation of the Stock instance
  public String toString() {
    return name + " Current Price: $ "+CurrentPrice +
        "\n Gain/Loss: " + (getChangePercent() * 100) + "%";
  }
}
