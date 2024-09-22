public class RewardValue {
    private double cashValue;
    private double milesValue;

    public void getMilesValue(double cashValue) {
        this.cashValue = cashValue;
        this.milesValue = cashValue / 0.0035; // Convert to miles
    }
    public RewardValue(int milesValue) {
        this.milesValue = milesValue;
        this.cashValue = milesValue * 0.0035; // Convert to cash
    }
    public double getCashValue() {
        return this.cashValue;
    }
    public double getMilesValue() {
        return this.milesValue;
    }

}
