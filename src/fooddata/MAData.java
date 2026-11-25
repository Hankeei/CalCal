package fooddata;

public enum MAData {
    CHEESE("Cheese", 3.67),
    LOW_FAT_CHEESE("Low Fat Cheese", 1.80),
    SOY_CHEESE("Soy Cheese", 2.50),
    LOW_FAT_MILK("Low Fat Milk", 0.34),
    SOY_MILK("Soy Milk", 0.52),
    WHOLE_MILK("Whole Milk", 0.63),
    YOGURT("Yogurt", 0.63),
    GREEK_YOGURT("Greek Yogurt", 0.97);

    private String name;
    private double calories;

    MAData(String name, double calories) {
        this.name = name;
        this.calories = calories; // Divide by 100 to convert to kcal per gram
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return calories;
    }
}