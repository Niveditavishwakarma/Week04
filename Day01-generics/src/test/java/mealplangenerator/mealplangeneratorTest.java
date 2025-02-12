package mealplangenerator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class mealplangeneratorTest {

        @Test
        void testVegetarianMeal() {
            Meal<VegetarianMeal> vegMeal = MealplanGenerator.generatePersonalizedMealPlan(new VegetarianMeal());
            assertEquals("Vegetarian Meal: Grilled tofu with vegetables", vegMeal.generateMealPlan());
        }

        @Test
        void testVeganMeal() {
            Meal<VeganMeal> veganMeal = MealplanGenerator.generatePersonalizedMealPlan(new VeganMeal());
            assertEquals("Vegan Meal: Quinoa salad with chickpeas", veganMeal.generateMealPlan());
        }

        @Test
        void testKetoMeal() {
            Meal<KetoMeal> ketoMeal = MealplanGenerator.generatePersonalizedMealPlan(new KetoMeal());
            assertEquals("Keto Meal: Grilled chicken with avocado", ketoMeal.generateMealPlan());
        }

        @Test
        void testHighProteinMeal() {
            Meal<HighProteinMeal> highProteinMeal = MealplanGenerator.generatePersonalizedMealPlan(new HighProteinMeal());
            assertEquals("High-Protein Meal: Salmon with quinoa", highProteinMeal.generateMealPlan());
        }

        @Test
        void testNullMealValidation() {
            Exception exception = assertThrows(IllegalArgumentException.class, () -> {
                MealplanGenerator.generatePersonalizedMealPlan(null);
            });
            assertEquals("Invalid meal plan: Meal cannot be null", exception.getMessage());
        }
    }

