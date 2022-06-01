package Class_exercises.Exercise_11;

import Class_exercises.Exercise_11.Exceptions.ConditionsNotAchieved;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Main {
    public static void main(String[] args) throws ConditionsNotAchieved {
        NutritionFacts n1 = NutritionFacts.builder().servingSize(12).servings(22).build();
        System.out.println(n1.toString());
        NutritionFacts n2 = NutritionFacts.builder().servingSize(12).servings(22).calories(1300).build();
        System.out.println(n2.toString());
        NutritionFacts n3 = NutritionFacts.builder().servingSize(12).servings(22).calories(1300).fat(22).build();
        System.out.println(n3.toString());
        NutritionFacts n4 = NutritionFacts.builder().servingSize(12).servings(22).calories(1300).fat(22).sodium(78).build();
        System.out.println(n4.toString());
        NutritionFacts n5 = NutritionFacts.builder().servingSize(12).servings(22).calories(1300).fat(22).sodium(78).carbohydrate(120).build();
        System.out.println(n5.toString());


    }
}
