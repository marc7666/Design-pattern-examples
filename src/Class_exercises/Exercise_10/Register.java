package Class_exercises.Exercise_10;

import Class_exercises.Exercise_10.Exceptions.ClassAlreadeInstanced;

import java.util.ArrayList;
import java.util.List;

public class Register {
    private static Register register;
    private int instances = 0;

    private List<Figure> figures;

    public Register() {
        instances++;
        this.figures = new ArrayList<>();
        System.out.println("Number of instances at this moment: " + this.instances);
    }

    public static synchronized Register getRegister() throws ClassAlreadeInstanced{
        if (register == null){
            register = new Register();
            System.out.println("New register created");
        }else{
            throw new ClassAlreadeInstanced("This class has been already instanced!");
        }
        return register;
    }

    public void addFigure(Figure f){
        this.figures.add(f);
    }

    public Figure obtainFigure(String name){
        for (Figure f : figures){
            if (f.getFigureName().equals(name)){
                return f;
            }
        }
        return null;
    }
}
