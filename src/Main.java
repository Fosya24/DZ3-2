public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.87;
        int weightKG = 98;
        int Bmi = service.calculate(weightKG, heightM);
        System.out.println(Bmi);
    }
}