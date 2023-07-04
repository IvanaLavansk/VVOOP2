public class BmiService {
    public int calculate(int weightKg, double heightInMeters) {
        return (int) (weightKg / heightInMeters / heightInMeters);
    }
}
