package Class_exercises.Exercise_11;

import Class_exercises.Exercise_11.Exceptions.ConditionsNotAchieved;

public class NutritionFactsBuilder implements Builder {
    private Integer servingSize = null;//    (ml) required
    private Integer servings = null;//    (units) required
    private Integer calories = null;//            optional
    private Integer fat = null;//             (g) optional
    private Integer sodium = null;//         (mg) optional
    private Integer carbohydrate = null;//    (g) optional

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
        this.sodium = num;
        return this;
    }

    @Override
    public NutritionFactsBuilder carbohydrate(int num) {
        this.carbohydrate = num;
        return this;
    }

    @Override
    public NutritionFacts build() throws ConditionsNotAchieved {
        checkConditions();
        if (this.calories == null && this.fat == null && this.sodium == null && this.carbohydrate == null) {
            return new NutritionFacts(this.servingSize, this.servings);
        } else if (this.fat == null && this.sodium == null && this.carbohydrate == null) {
            return new NutritionFacts(this.servingSize, this.servings, this.calories);
        } else if (this.sodium == null && this.carbohydrate == null) {
            return new NutritionFacts(this.servingSize, this.servings, calories, this.fat);
        } else if (this.carbohydrate == null) {
            return new NutritionFacts(this.servingSize, this.servings, calories, this.fat, this.sodium);
        } else {
            return new NutritionFacts(this.servingSize, this.servings, calories, this.fat, this.sodium, this.carbohydrate);
        }
    }

    public void checkConditions() throws ConditionsNotAchieved {
        if (this.servingSize == null) {
            throw new ConditionsNotAchieved("No serving size");
        } else if (this.servings == null) {
            throw new ConditionsNotAchieved("No servings");
        }
    }
}
