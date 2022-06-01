package Class_exercises.Exercise_10;

import Class_exercises.Exercise_10.Exceptions.ClassAlreadeInstanced;

public class Main {
    public static void main(String[] args) throws ClassAlreadeInstanced {
        String c1Name = "Circle 1";
        String r1Name = "Rectangle 1";
        Figure c = new Circle(12.5f, c1Name);
        Figure r = new Rectangle(45f, 66f, r1Name);

        String comp1Name = "Compiste 1 ";
        Composite comp = new Composite(comp1Name);

        comp.addSubfigure(c);
        comp.addSubfigure(r);


        Circle c2 = (Circle) c.copy();
        Rectangle r2 = (Rectangle) r.copy();
        Composite comp2 = (Composite) comp.copy();

        System.out.println("---------- Checking if copies are equal to the originals ----------");

        System.out.println("---------- Composites comparison ----------");
        System.out.printf(comp.toString());
        System.out.println("\n" + comp2.toString());

        System.out.println("---------- Circles comparison ----------");
        System.out.println(c);
        System.out.println(c2);

        System.out.println("---------- Rectangles comparison ----------");
        System.out.println(r);
        System.out.println(r2);

        System.out.println("\n");
        System.out.println("---------- Checking if draws are done correctly ----------");
        Circle c3 = (Circle) c.draw();
        Rectangle r3 = (Rectangle) r.draw();
        Composite comp3 = (Composite) comp.draw();
        if (c3 == c) {
            System.out.println("Circle draw() ok");
        }
        if (r3 == r) {
            System.out.println("Rectangle draw() ok");
        }
        if (comp3 == comp) {
            System.out.println("Composite draw() ok");
        }

        System.out.println("---------- Checking Register class ----------");
        Register reg1 = Register.getRegister();
        /**
         * Register reg2 = Register.getRegister();
         * Creating reg2 an exception will be thrown.
         **/
        String recForRegister = "Rectangle for register";
        Figure fig1 = new Rectangle(12f, 5f, recForRegister);
        reg1.addFigure(fig1);
        String circleForRegister = "Circle for register";
        Figure fig2 = new Circle(55f, circleForRegister);
        reg1.addFigure(fig2);
        System.out.println("***** Checking a figure that already exists in the register *****");
        System.out.println(reg1.obtainFigure("Circle for register"));
        System.out.println("***** Checking a figure that doesn't exist in the register *****");
        String nameFigure = "Square for the register";
        System.out.println(reg1.obtainFigure(nameFigure));


    }
}
