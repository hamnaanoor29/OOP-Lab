package LabTasks.Lab6;
public class Util {
    public static void draw(Shapes[] shapes) {
        for (Shapes s1 : shapes)
            if (s1 != null)
                s1.draw();
    }

    public static void erase(Shapes[] shapes) {
        for (Shapes s1 : shapes)
            if (s1 != null)
                s1.erase();

    }
    public static void colour(Shapes[]shapes) {
        for (Shapes s1 : shapes)
            if (s1 != null)
                s1.colour();
    }


}

