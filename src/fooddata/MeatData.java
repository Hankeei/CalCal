package fooddata;

public enum MeatData {
    PORK("Pork", 2.42),
    BEEF("Beef", 2.5),
    CHICKEN("Chicken", 2.39),
    MUTTON("Mutton", 2.94),
    FISH("Fish", 2.05),
    SHRIMP("Shrimp", 0.99),
    EGG("Egg", 1.55),
    SALTY_EGG("Salty Egg", 1.91),
    GRILLED_SALMON("Grilled Salmon", 2.26);

    private String name;
    private double calories;

    MeatData(String name, double calories) {
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
