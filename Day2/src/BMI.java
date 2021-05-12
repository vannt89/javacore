public class BMI {

    public void calculateBMI(double chieucao, double cannang) {
        double bmi = cannang / (chieucao * chieucao);
        System.out.println("bmi = " + bmi);

        if (bmi < 18.5) {
            System.out.println("Thiếu cân");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("Cân đối");
        } else {
            System.out.println("Thừa cân");
        }
    }


}
