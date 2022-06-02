package Class_exercises.Exercise_17;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 02/06/2022.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("---------- Text factory test ----------");
        FigureFactory myFactory = new TextFactory(true);
        Figure f1 = myFactory.makeFigure();
        f1.clickButtonOn();
        f1.drag(12);
        f1.move(0, 45);
        f1.scale(1 / 2f);
        f1.drop();

        System.out.println("---------- Line factory test ----------");
        myFactory = new LineFactory(false);
        f1 = myFactory.makeFigure();
        f1.clickButtonOn();
        f1.drag(12);
        f1.move(0, 45);
        f1.scale(1 / 2f);
        f1.drop();

        System.out.println("---------- Rectangle factory test ----------");
        myFactory = new RectangleFactory(true);
        f1 = myFactory.makeFigure();
        f1.clickButtonOn();
        f1.drag(12);
        f1.move(0, 45);
        f1.scale(1 / 2f);
        f1.drop();
    }
}
