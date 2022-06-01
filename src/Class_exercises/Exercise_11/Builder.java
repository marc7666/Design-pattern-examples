package Class_exercises.Exercise_11;

import Class_exercises.Exercise_11.Exceptions.ConditionsNotAchievedException;

public interface Builder {
    NutritionFactsBuilder servingSize(int num);

    NutritionFactsBuilder servings(int num);

    NutritionFactsBuilder calories(int num);

    NutritionFactsBuilder fat(int num);

    NutritionFactsBuilder sodium(int num);

    NutritionFactsBuilder carbohydrate(int num);

    NutritionFacts build() throws ConditionsNotAchievedException;
}
