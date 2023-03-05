public class CreditPaymentService {
    public int calculate(int s, float r, int n) {
        float i = r / 100 / 12;
        int y = n * 12;
        double result = ((Math.pow((1 + i), y) * i) / (Math.pow((1 + i), y) - 1)) * s;
        return (int) result;
    }
}
