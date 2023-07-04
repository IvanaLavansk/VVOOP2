public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 48;
        double heightInMeters = 1.6;
        double bmiIndex = service.calculate((int) weightInKg, heightInMeters);

        System.out.println("Ваш индекс массы тела: " + bmiIndex);
    }
}