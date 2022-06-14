package Class_exercises.Exercise_5;

import java.awt.*;
import java.util.Arrays;

/**
 * @project: Design-pattern-examples.
 * @author: mcr99 on 30/05/2022.
 */
public class ColorRectangle extends Rectangle {
    private Color c;

    public ColorRectangle(float x, float y, float width, float height, Color c) {
        super(x, y, width, height);
        this.c = c;
    }

    @Override
    public Figure copy() {
        return new ColorRectangle(getX(), getY(), getWidth(), getHeight(), this.c);
    }

    @Override
    public void getFigure() {
        String colorName = getColorName();
        System.out.println("This is a colored rectangle with height " + getHeight() + ", width " + getWidth() + " and color " + colorName);

    }

    public String getColorName() {
        int red = c.getRed();
        int green = c.getGreen();
        int blue = c.getBlue();
        if (red == 255 && green == 255 && blue == 255) {
            return "White";
        } else if (red == 192 && green == 192 && blue == 192) {
            return "Light gray";
        } else if (red == 128 && green == 128 && blue == 128) {
            return "Gray";
        } else if (red == 64 && green == 64 && blue == 64) {
            return "Dark gray";
        } else if (red == 0 && green == 0 && blue == 0) {
            return "Black";
        } else if (red == 255 && green == 0 && blue == 0) {
            return "Red";
        } else if (red == 255 && green == 175 && blue == 175) {
            return "Pink";
        } else if (red == 255 && green == 200 && blue == 0) {
            return "Orange";
        } else if (red == 255 && green == 255 && blue == 0) {
            return "Yellow";
        } else if (red == 0 && green == 255 && blue == 0) {
            return "Green";
        } else if (red == 255 && green == 0 && blue == 255) {
            return "Magenta";
        } else if (red == 0 && green == 255 && blue == 255) {
            return "Cyan";
        } else {
            return "Blue";
        }
    }
}
