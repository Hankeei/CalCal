import fooddata.*;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {

        //utils
        double height = 0, weight = 0, tdee = 0, bmr = 0, bmi = 0, totalCalories = 0;
        int activity = 0, age = 0; //
        boolean gender = true; // male = true, female = false
        String sel; // selection input
        boolean run = true; // Keep the program looping until the user decide to exit the program
        TextGui textgui = new TextGui();
        Calculation cal = new Calculation();
        DecimalFormat df = new DecimalFormat("###.#");
        List<FoodEntry> foodEntries = new ArrayList<>();


        //Start of the program
        textgui.graphicgui();

        while (run) {
            textgui.maingui();
            textgui.askforinput();
            sel = sc.nextLine();
            switch (sel) {
                case "1":
                    //inputting data
                    double[] inputresult = inputdata();
                    height = inputresult[0];
                    weight = inputresult[1];
                    if (inputresult[2] == 2) {
                        gender = false;
                    }
                    age = (int) inputresult[3];
                    activity = (int) inputresult[4];

                    break;
                case "2":
                    //food menu
                    boolean runf = true, runm = true;
                    while (runm) {
                        textgui.foodguimain();
                        textgui.askforinput();
                        String inputt = sc.nextLine().toLowerCase();
                        switch (inputt) {
                            case ("a"):
                                while (runf) {
                                    textgui.foodguia();
                                    textgui.askforinput();
                                    String self = sc.nextLine();
                                    switch (self) {
                                        case "a":
                                            while (true) {
                                                System.out.println("============");
                                                System.out.println("Grains Menu");
                                                char index = 'a';
                                                for (GrainsData food : GrainsData.values()) {
                                                    System.out.println(index + ". " + food.getName());
                                                    index++;
                                                }
                                                System.out.println("q. Return back");
                                                System.out.println("============");

                                                String input = sc.nextLine().toLowerCase();
                                                if (input.equals("q")) {
                                                    System.out.println("Returning back...");
                                                    break;
                                                } else {
                                                    char selectedFoodIndex = input.charAt(0);
                                                    int foodIndex = selectedFoodIndex - 'a';

                                                    if (foodIndex >= 0 && foodIndex < GrainsData.values().length) {
                                                        GrainsData selectedFood = GrainsData.values()[foodIndex];
                                                        System.out.print("Enter the quantity in grams: ");
                                                        double quantity = sc.nextDouble();
                                                        sc.nextLine();

                                                        double calories = selectedFood.getCalories() * quantity;
                                                        FoodEntry foodEntry = new FoodEntry(selectedFood.getName(), quantity, calories);
                                                        foodEntries.add(foodEntry);
                                                    } else {
                                                        System.out.println("Invalid selection. Please try again.");
                                                    }
                                                }
                                            }
                                            break;
                                        case "b":
                                            while (true) {
                                                System.out.println("============");
                                                System.out.println("Vegetables Menu");
                                                char index = 'a';
                                                for (VegeData food : VegeData.values()) {
                                                    System.out.println(index + ". " + food.getName());
                                                    index++;
                                                }
                                                System.out.println("q. Return back");
                                                System.out.println("============");

                                                String input = sc.nextLine().toLowerCase();
                                                if (input.equals("q")) {
                                                    System.out.println("Returning back...");
                                                    break;
                                                } else {
                                                    char selectedFoodIndex = input.charAt(0);
                                                    int foodIndex = selectedFoodIndex - 'a';

                                                    if (foodIndex >= 0 && foodIndex < VegeData.values().length) {
                                                        VegeData selectedFood = VegeData.values()[foodIndex];
                                                        System.out.print("Enter the quantity in grams: ");
                                                        double quantity = sc.nextDouble();
                                                        sc.nextLine();

                                                        double calories = selectedFood.getCalories() * quantity;
                                                        FoodEntry foodEntry = new FoodEntry(selectedFood.getName(), quantity, calories);
                                                        foodEntries.add(foodEntry);
                                                    } else {
                                                        System.out.println("Invalid selection. Please try again.");
                                                    }
                                                }
                                            }
                                            break;
                                        case "c":
                                            while (true) {
                                                System.out.println("============");
                                                System.out.println("Fruit Menu");
                                                char index = 'a';
                                                for (FruitData food : FruitData.values()) {
                                                    System.out.println(index + ". " + food.getName());
                                                    index++;
                                                }
                                                System.out.println("q. Return back");
                                                System.out.println("============");

                                                String input = sc.nextLine().toLowerCase();
                                                if (input.equals("q")) {
                                                    System.out.println("Returning back...");
                                                    break;
                                                } else {
                                                    char selectedFoodIndex = input.charAt(0);
                                                    int foodIndex = selectedFoodIndex - 'a';

                                                    if (foodIndex >= 0 && foodIndex < FruitData.values().length) {
                                                        FruitData selectedFood = FruitData.values()[foodIndex];
                                                        System.out.print("Enter the quantity in grams: ");
                                                        double quantity = sc.nextDouble();
                                                        sc.nextLine();

                                                        double calories = selectedFood.getCalories() * quantity;
                                                        FoodEntry foodEntry = new FoodEntry(selectedFood.getName(), quantity, calories);
                                                        foodEntries.add(foodEntry);
                                                    } else {
                                                        System.out.println("Invalid selection. Please try again.");
                                                    }
                                                }
                                            }
                                            break;
                                        case "d":
                                            while (true) {
                                                System.out.println("============");
                                                System.out.println("Milk and Dairies Menu");
                                                char index = 'a';
                                                for (MAData food : MAData.values()) {
                                                    System.out.println(index + ". " + food.getName());
                                                    index++;
                                                }
                                                System.out.println("q. Return back");
                                                System.out.println("============");

                                                String input = sc.nextLine().toLowerCase();
                                                if (input.equals("q")) {
                                                    System.out.println("Returning back...");
                                                    break;
                                                } else {
                                                    char selectedFoodIndex = input.charAt(0);
                                                    int foodIndex = selectedFoodIndex - 'a';

                                                    if (foodIndex >= 0 && foodIndex < MAData.values().length) {
                                                        MAData selectedFood = MAData.values()[foodIndex];
                                                        System.out.print("Enter the quantity in grams: ");
                                                        double quantity = sc.nextDouble();
                                                        sc.nextLine();

                                                        double calories = selectedFood.getCalories() * quantity;
                                                        FoodEntry foodEntry = new FoodEntry(selectedFood.getName(), quantity, calories);
                                                        foodEntries.add(foodEntry);
                                                    } else {
                                                        System.out.println("Invalid selection. Please try again.");
                                                    }
                                                }
                                            }
                                            break;
                                        case "e":
                                            while (true) {
                                                System.out.println("============");
                                                System.out.println("Meat Menu");
                                                char index = 'a';
                                                for (MeatData food : MeatData.values()) {
                                                    System.out.println(index + ". " + food.getName());
                                                    index++;
                                                }
                                                System.out.println("q. Return back");
                                                System.out.println("============");

                                                String input = sc.nextLine().toLowerCase();
                                                if (input.equals("q")) {
                                                    System.out.println("Returning back...");
                                                    break;
                                                } else {
                                                    char selectedFoodIndex = input.charAt(0);
                                                    int foodIndex = selectedFoodIndex - 'a';

                                                    if (foodIndex >= 0 && foodIndex < MeatData.values().length) {
                                                        MeatData selectedFood = MeatData.values()[foodIndex];
                                                        System.out.print("Enter the quantity in grams: ");
                                                        double quantity = sc.nextDouble();
                                                        sc.nextLine();

                                                        double calories = selectedFood.getCalories() * quantity;
                                                        FoodEntry foodEntry = new FoodEntry(selectedFood.getName(), quantity, calories);
                                                        foodEntries.add(foodEntry);
                                                    } else {
                                                        System.out.println("Invalid selection. Please try again.");
                                                    }
                                                }
                                            }
                                            break;

                                        case "q":
                                            System.out.println("Returning back...");
                                            runf = false;
                                            break;
                                        default:
                                            System.out.println("Invalid selection. Please try again.");
                                            break;
                                    }
                                }
                                break;
                            case ("b"):
                                System.out.println("===============================");
                                //put food in it
                                System.out.println("Food Data of today:");
                                for (FoodEntry foodEntry : foodEntries) {
                                    System.out.println("Food: " + foodEntry.getFoodName());
                                    System.out.println("Quantity: " + foodEntry.getQuantity() + " grams");
                                    System.out.println("Calories: " + df.format(foodEntry.getCalories()));
                                    System.out.println("==========");
                                    totalCalories += foodEntry.getCalories();
                                }

                                System.out.println("Total Calories: " + df.format(totalCalories));

                                //System.out.println("Your calories intake : " + );
                                System.out.println("===============================");
                                break;
                            case ("c"):
                                foodEntries.clear();
                                System.out.println("The food intake data as been cleared");
                                break;
                            case ("q"):
                                System.out.println("Returning you to the main menu...");
                                runm = false;
                                break;
                            default:
                                System.out.println("Invalid input. Please try again.");
                                break;
                        }
                    }
                    break;
                case "3":
                    //check inputted data
                    showdata(height, weight, gender, age, activity);
                    break;
                case "4":
                    //reset all data
                    System.out.println();
                    System.out.println();
                    //body
                    height = 0;
                    weight = 0;
                    activity = 0;
                    gender = true;
                    System.out.println("All Body Data have been cleared!");
                    //food

                    break;
                case "5":
                    bmi = Math.round(cal.calculateBMI(height, weight));
                    bmr = Math.round(cal.calculateBMR(height, weight, age, gender));
                    tdee = Math.round(cal.calculateTDEE(cal.calculateBMR(height, weight, age, gender), activity));

                    //calculation
                    System.out.println();
                    System.out.println("===============================");
                    System.out.println("Body Data:");
                    System.out.println("Your BMI: " + df.format(bmi));
                    System.out.println("Your BMR: " + bmr);
                    System.out.println("Your TDEE (Total Daily Energy Expenditure): " + tdee);
                    System.out.println("===============================");
                    //put food in it
                    System.out.println("Food Data of today:");
                    for (FoodEntry foodEntry : foodEntries) {
                        System.out.println("Food: " + foodEntry.getFoodName());
                        System.out.println("Quantity: " + foodEntry.getQuantity() + " grams");
                        System.out.println("Calories: " + foodEntry.getCalories());
                        System.out.println("==========");
                        df.format(totalCalories += foodEntry.getCalories());
                    }

                    System.out.println("Total Calories: " + totalCalories);

                    //System.out.println("Your calories intake : " + );
                    System.out.println("===============================");
                    System.out.println("Body report");
                    System.out.println("Your BMI level: " + cal.compareBMI(cal.calculateBMI(height, weight)));

                    //Here we're using the BMI to depend on the user need to take fewer calories or take more calories
                    System.out.println();
                    System.out.println("===============================");
                    System.out.println("Here is our recommendation for your meal's calories intake.");
                    System.out.println("For bulking: " + (tdee + 500) + " calories");
                    System.out.println("For maintenance: " + tdee + " calories");
                    System.out.println("For cutting: " + (tdee - 500) + " calories");
                    System.out.println();

                    if (bmi < 18.5) {
                        System.out.println("As your bmi result show that you are underweight , we would recommend you to bulk.");
                        if (totalCalories < (tdee+500)) {
                            System.out.println("You should eat more about " + ((tdee+500) - totalCalories) + " calories.");
                        }
                    } else if (bmi < 25) {
                    } else if (bmi < 30) {
                        System.out.println("As your bmi result show that you overweight , we would recommend you to cut.");
                        if (totalCalories > (tdee-500)) {
                            System.out.println("You should eat less about " + (totalCalories - (tdee-500) + " calories."));
                        }
                    }

                    System.out.println("Would you like to see a recommended macronutrient intake plan? (press y)");
                    boolean runrec = true;
                    while (runrec) {
                        String choice = sc.nextLine();
                        if (choice.equals("y")) {
                            System.out.println("Which plan you are going to choose? ");
                            System.out.println("a: cutting ");
                            System.out.println("b: maintaining ");
                            System.out.println("c: bulking ");
                            String choice2 = sc.nextLine();
                            if (choice2.equals("a")) {
                                System.out.println("For a Moderate Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee - 500) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee - 500) / 35 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee - 500) / 35 / 4)) + " g");
                                System.out.println("For a Lower Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee - 500) / 40 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee - 500) / 40 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee - 500) / 20 / 4)) + " g");
                                System.out.println("For a Higher Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee - 500) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee - 500) / 20 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee - 500) / 50 / 4)) + " g");
                                runrec = false;
                            } else if (choice2.equals("b")) {
                                System.out.println("For a Moderate Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee) / 35 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee) / 35 / 4)) + " g");
                                System.out.println("For a Lower Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee) / 40 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee) / 40 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee) / 20 / 4)) + " g");
                                System.out.println("For a Higher Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee) / 20 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee) / 50 / 4)) + " g");
                                runrec = false;
                            } else if (choice2.equals("c")) {
                                System.out.println("For a Moderate Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee + 500) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee + 500) / 35 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee + 500) / 35 / 4)) + " g");
                                System.out.println("For a Lower Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee + 500) / 40 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee + 500) / 40 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee + 500) / 20 / 4)) + " g");
                                System.out.println("For a Higher Carb plan, we would recommend: ");
                                System.out.println("Protein: " + Math.round(((tdee + 500) / 30 / 4)) + " g");
                                System.out.println("Fats: " + Math.round(((tdee + 500) / 20 / 9)) + " g");
                                System.out.println("Carbs: " + Math.round(((tdee + 500) / 50 / 4)) + " g");
                                runrec = false;
                            } else {
                                System.out.println("Invalid input");
                                textgui.askforinput();

                            }
                        }
                    }

                    System.out.println("===============================");
                    break;
                case "0":
                    //save data

                    //quitting the program
                    System.out.println();
                    System.out.println("-------------------------------------------");
                    System.out.println("| Thank you for using calories calculator |");
                    System.out.println("-------------------------------------------");

                    run = false;
                    break;
                default:
                    System.out.println("Invalid input, try again.");

            }
        }


        sc.close();
    }

    public static double[] inputdata() {

        double h, w, g = 0;
        int a = 0, age = 0;
        String gs;
        boolean run = true;
        Scanner sc = new Scanner(System.in);
        TextGui textgui = new TextGui();


        System.out.println();
        System.out.println("Enter your height(cm): ");
        h = sc.nextDouble();
        System.out.println("Enter your weight(kg): ");
        w = sc.nextDouble();
        while (run) {
            System.out.println("Select your gender (m/f): ");
            gs = sc.next().toLowerCase();
            if (gs.equals("m")) {
                g = 1;
                run = false;
            } else if (gs.equals("f")) {
                g = 2;
                run = false;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
        System.out.println("Enter your age: ");
        age = sc.nextInt();
        do {
            System.out.println("Select your activity rate");
            System.out.println("1. Sedentary (little to no exercise)");
            System.out.println("2. Lightly (1-2 day sports per week)");
            System.out.println("3. Moderately (3-5 day sports per week)");
            System.out.println("4. Very active (6-7 day sports per week)");
            System.out.println("5. Extra (sports & physical job or 2x training)");
            textgui.askforinput();
            a = sc.nextInt();
        } while (a < 1 || a > 5);
        return new double[]{h, w, g, age, (double) a};
    }

    public static void showdata(double height, double weight, boolean gender, int age, int activity) {

        if (height == 0 && weight == 0) {
            System.out.println("You haven't enter your body data yet!");
            System.out.println();
        } else {
            //Body
            System.out.println("=====================");
            System.out.println("Your body data: ");
            System.out.println("Height : " + height);
            System.out.println("Weight : " + weight);
            if (gender) {
                System.out.println("Gender: Male");
            } else {
                System.out.println("Gender: Female");
            }
            System.out.println("Age : " + age);
            switch (activity) {
                case 1:
                    System.out.println("Your activity rate: Sedentary (little to no exercise)");
                    break;
                case 2:
                    System.out.println("Your activity rate: Lightly (1-2 day sports per week)");
                    break;
                case 3:
                    System.out.println("Your activity rate: Moderately (3-5 day sports per week)");
                    break;
                case 4:
                    System.out.println("Your activity rate: Very active (6-7 day sports per week)");
                    break;
                case 5:
                    System.out.println("Your activity rate: Extra (sports & physical job or 2x training)");
                    break;
            }
            System.out.println("===============================");
            //Food
        }

    }

//    public static void recommendation(double bmi, double tdee) {
//
//    }
}

class FoodEntry {
    private String foodName;
    private double quantity;
    private double calories;

    public FoodEntry(String foodName, double quantity, double calories) {
        this.foodName = foodName;
        this.quantity = quantity;
        this.calories = calories;
    }

    public String getFoodName() {
        return foodName;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getCalories() {
        return calories;
    }
}
