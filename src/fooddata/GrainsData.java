package fooddata;

public enum GrainsData {
    RICE("Rice", 0.67),
    OATS("Oats", 0.64),
    QUINOA("Quinoa", 1.19),
    BARLEY("Barley", 1.23),
    WHEAT("Wheat", 0.87),
    NOODLES("Noodles", 1.38),
    MILLET("Millet", 1.19);

    private String name;
    private double kcal;

    GrainsData(String name, double kcal) {
        this.name = name;
        this.kcal = kcal;
    }

    public String getName() {
        return name;
    }

    public double getCalories() {
        return kcal;
    }
}
