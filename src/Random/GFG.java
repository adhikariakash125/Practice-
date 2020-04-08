package Random;// Java program to classify a given triangle
import java.util.*;
class GFG
{

    static class point
    {
        int x, y;
        point() {}

        public point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }
    };

    // Utility method to return square of x
    static int square(int x)
    {
        return x * x;
    }
    static int a, b, c;

    // Utility method to sort a, b, c; after this
// method a <= b <= c
    static void order()
    {
        int []copy = new int[3];
        copy[0] = a;
        copy[1] = b;
        copy[2] = c;
        Arrays.sort(copy);
        a = copy[0];
        b = copy[1];
        c = copy[2];
    }

    // Utility method to return Square of distance
// between two points
    static int euclidDistSquare(point p1, point p2)
    {
        return square(p1.x - p2.x) + square(p1.y - p2.y);
    }

    // Method to classify side
    static String getSideClassification(int a,
                                        int b, int c)
    {
        // if all sides are equal
        if (a == b && b == c)
            return "Equilateral";

            // if any two sides are equal
        else if (a == b || b == c)
            return "Isosceles";

        else
            return "Scalene";
    }

    // Method to classify angle
    static String getAngleClassification(int a,
                                         int b, int c)
    {
        // If addition of sum of square of two side
        // is less, then acute
        if (a + b > c)
            return "acute";

            // by pythagoras theorem
        else if (a + b == c)
            return "right";

        else
            return "obtuse";
    }

    // Method to classify the triangle
// by sides and angles
    static void classifyTriangle(point p1,
                                 point p2, point p3)
    {
        // Find squares of distances between points
        a = euclidDistSquare(p1, p2);
        b = euclidDistSquare(p1, p3);
        c = euclidDistSquare(p2, p3);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        // Sort all squares of distances in increasing order
        order();

        System.out.println( "Triangle is "
                + getAngleClassification(a, b, c)
                + " and "
                + getSideClassification(a, b, c));
    }

    // Driver code
    public static void main(String[] args)
    {
        point p1, p2, p3;
        p1 = new point(3, 0);
        p2 = new point(0, 4);
        p3 = new point(4, 7);
        classifyTriangle(p1, p2, p3);

        p1 = new point(0, 0);
        p2 = new point(1, 1);
        p3 = new point(1, 2);
        classifyTriangle(p1, p2, p3);
    }
}

// This code is contributed by Rajput-Ji
