public class CurrencyConverter {
    private double value;
    private double rate;


    public double calculateConvertion(double value, double rate ) {
        this.rate = rate;
        this.value = value;
        return this.value * this.rate;
    }
}
