package fooddata;

public enum VegeData {
    KALE("Kale", 0.24),
    CHOI_SUM("Choi Sum", 0.12),
    BROCCOLI("Broccoli", 0.337),
    LETTUCE("Lettuce", 0.148),
    CELERY("Celery", 0.14),
    TONGCAI("Tongcai", 0.189),
    BEAN_SPROUTS("Bean Sprouts", 0.26),
    CHINESE_CABBAGE("Chinese Cabbage", 0.12);

    private String name;
    private double calories;

    VegeData(String name, double calories) {
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