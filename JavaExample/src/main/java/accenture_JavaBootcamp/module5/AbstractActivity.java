package accenture_JavaBootcamp.module5;

/**
 * Abstract activity
 */
public class AbstractActivity {
    public static void main(String args[]) {
        // TODO: Create a Rectangle object, set color to "Blue", and print the color
        Rectangle rectangle = new Rectangle();
        rectangle.setColor("Blue");
        String rectangleColor = rectangle.getColor();
        System.out.println("The color of rectangle : " + rectangleColor);
        System.out.println("---------------------------------");

        // TODO: Print the area and perimeter of the rectangle (using length = 2, breadth = 4, radius = 0)
        Double rectangleArea = rectangle.calculateArea(2,4,0);
        System.out.println("The rectangle area using using length = 2, breadth = 4, radius = 0 ==> "+ rectangleArea);

        Double rectanglePerimeter = rectangle.calculatePerimeter(2,4,0);
        System.out.println("The rectangle perimeter using using length = 2, breadth = 4, radius = 0 ==> "+ rectanglePerimeter);
        System.out.println("---------------------------------");

        // TODO: Create a Circle object, set color to "Pink", and print the color
        Circle circle = new Circle();
        circle.setColor("Pink");
        String circleColor = circle.getColor();
        System.out.println("The color of circle : " + circleColor);
        System.out.println("---------------------------------");

        // TODO: Print the area and perimeter of the circle (using length = 0, breadth = 0, radius = 5)
        Double circleArea = circle.calculateArea(0,0,5);
        System.out.println("The circle area using using length = 0, breadth = 0, radius = 5 ==> "+ circleArea);

        Double circlePerimeter = circle.calculatePerimeter(0,0,5);
        System.out.println("The circle perimeter using using length = 0, breadth = 0, radius = 5 ==> "+ circlePerimeter);

    }
}
