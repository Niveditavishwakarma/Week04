package mealplangenerator;

public class MealplanGenerator {
    public static <T extends MealPlan> Meal<T> generatePersonalizedMealPlan(T meal) {
        if (meal == null) {
            throw new IllegalArgumentException("Invalid meal plan: Meal cannot be null");
        }
        return new Meal<>(meal);
    }
}
