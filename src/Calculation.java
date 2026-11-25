public class Calculation {

    public double calculateBMI(double height, double weight) {
        //bmi calculation
        return weight / ((height/100) * (height/100));
    }

    public String compareBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal weight";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obesity (Class I)";
        } else if (bmi < 40) {
            return "Obesity (Class II)";
        } else {
            return "Obesity (Class III or severe obesity)";
        }
    }

    public double[] dailyintake(double c){
        return new double[]{c - 500, c + 500};
    }

    public double calculateBMR(double height, double weight, int age, boolean gender) {
        double bmr = 0;
        //the formula call Mifflin-St Jeor Equation
        if (gender) {
            // BMR calculation for males
            bmr = 10 * weight + 6.25 * height - 5 * age + 5;
        } else {
            // BMR calculation for females
            bmr = 10 * weight + 6.25 * height - 5 * age - 161;
        }
        return bmr;
    }

    public double calculateTDEE(double bmr, int activityLevel) {
        double tdee;
        double activityFactor = 0;

        //TDEE calculation

        switch (activityLevel) {
            case 1:
                activityFactor = 1.2; // Sedentary
                break;
            case 2:
                activityFactor = 1.375; // Lightly
                break;
            case 3:
                activityFactor = 1.55; // Moderate
                break;
            case 4:
                activityFactor = 1.725; // Very active
                break;
            case 5:
                activityFactor = 1.9; // Extra
                break;
        }

        tdee = bmr * activityFactor;
        return tdee;
    }
}

