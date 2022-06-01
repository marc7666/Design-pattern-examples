package Class_exercises.Exercise_11;

import Class_exercises.Exercise_11.Exceptions.ConditionsNotAchievedException;

public class NutritionFactsBuilder implements Builder {
    private int servingSize = 0;//    (ml) required
    private int servings = 0;//    (units) required
    private int calories;//            optional
    private int fat;//             (g) optional
    private int sodium;//         (mg) optional
    private int carbohydrate;//    (g) optional

    @Override
    public NutritionFactsBuilder servingSize(int num) {
        this.servingSize = num;
        return this;
    }

    @Override
    public NutritionFactsBuilder servings(int num) {
        this.servings = num;
        return this;
    }

    @Override
    public NutritionFactsBuilder calories(int num) {
        this.calories = num;
        return this;
    }

    @Override
    public NutritionFactsBuilder fat(int num) {
        this.fat = num;
        return this;
    }

    @Override
    public NutritionFactsBuilder sodium(int num) {
        this.sodium = sodium;
        return this;
    }

    @Override
    public NutritionFactsBuilder carbohydrate(int num) {
        this.carbohydrate = num;
        return this;
    }

    @Override
    public NutritionFacts build() {

    }

    public void checkConditions() throws ConditionsNotAchievedException {
        if (this.servingSize == 0) {
            throw new ConditionsNotAchievedException("No serving size");
        } else if (this.servings == 0) {
            throw new ConditionsNotAchievedException("No servings");
        }
    }
}
