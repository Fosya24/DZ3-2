public class BmiService {

    public int calculate(int weightKG, double heightM) {
        int Bmi = (int) (weightKG / (heightM * heightM));
        return Bmi;
    }
}
