package Class_exercises.Exercise_18;

public abstract class Figure {
    private float x;
    private float y;

    public Figure() {
        this.x = 0f;
        this.y = 0f;
    }

    public abstract Figure copy();
    public abstract void acceptVisitor(Visitor v);
}
