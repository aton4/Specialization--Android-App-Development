package mooc.vandy.java4android.buildings.logic;

import java.io.FileNotFoundException;

import mooc.vandy.java4android.buildings.ui.OutputInterface;

/**
 * This Neighborhood utility class provides static helper methods the
 * print a Building List and calculate the area of a Building list.
 * A utility class in Java should always be final and have a private
 * constructor.
 */
public final class Neighborhood {

    // TODO - Put your code here.
    public Neighborhood(){};

    public static void print(Building[] buildings, String header, OutputInterface out)
    {
        for (Building element : buildings)
            header +=  element.toString() + "\n";

        out.print(header);
    }

    public static int calcArea(Building[] buildings)
    {
        int totalLotArea = 0;

        for (Building element : buildings)
            totalLotArea += element.calcLotArea();

        return totalLotArea;
    }
}
