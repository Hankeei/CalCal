package fooddata;

public enum FruitData {
    DURIAN("Durian", 1.47),
    BANANA("Banana", 0.88),
    PINEAPPLE("Pineapple", 0.51),
    WATERMELON("Watermelon", 0.30),
    LONGAN("Longan", 0.70),
    LYCHEE("Lychee", 0.67),
    DRAGON_FRUIT("Dragon Fruit", 0.48),
    MANGO("Mango", 0.48),
    GRAPES("Grapes", 0.63),
    PASSION_FRUIT("Passion Fruit", 0.58);

    private String name;
    private double calories;

    FruitData(String name, double calories) {
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