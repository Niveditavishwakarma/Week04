package mealplangenerator;

public class Meal<T extends MealPlan> {
    private T meal;

    public Meal(T meal) {
        this.meal = meal;
    }

    public String generateMealPlan() {
        return meal.getMealDetails();
    }

    public void printMealPlan() {
        System.out.println("Meal Plan: " + generateMealPlan());
    }
}
