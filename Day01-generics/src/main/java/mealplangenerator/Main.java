package mealplangenerator;

public class Main {
    public static void main(String[] args)
    {
        try {
            Meal<VegetarianMeal> vegMeal = MealplanGenerator.generatePersonalizedMealPlan(new VegetarianMeal());
            Meal<VeganMeal> veganMeal = MealplanGenerator.generatePersonalizedMealPlan(new VeganMeal());
            Meal<KetoMeal> ketoMeal = MealplanGenerator.generatePersonalizedMealPlan(new KetoMeal());
            Meal<HighProteinMeal> highProteinMeal = MealplanGenerator.generatePersonalizedMealPlan(new HighProteinMeal());

            vegMeal.printMealPlan();
            veganMeal.printMealPlan();
            ketoMeal.printMealPlan();
            highProteinMeal.printMealPlan();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

