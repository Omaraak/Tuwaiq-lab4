public class Main {
    public static void main(String[] args) {
        //Circle class
        System.out.println("Circle class\n");
        Circle circle = new Circle(0);

        //Accessors and Mutators
        System.out.println("Accessors and Mutators");
        System.out.println("r value: "+circle.getRadios());
        circle.setRadios(3);
        System.out.println("r value: "+circle.getRadios());

        //Calculate area func and Calculate circumference
        System.out.println("\nCalculate area func and Calculate circumference");
        System.out.println("Circle area: "+circle.calculateArea());
        System.out.println("Circle circumference: "+circle.calculateCircumference());

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        //Rectangle class
        System.out.println("\nRectangle class\n");
        Rectangle rectangle = new Rectangle(0,0);

        //Accessors and Mutators
        System.out.println("Accessors and Mutators");
        System.out.println("w value: "+rectangle.getWidth());
        rectangle.setWidth(3);
        System.out.println("w value: "+rectangle.getWidth());

        System.out.println();

        System.out.println("h value: "+rectangle.getHeight());
        rectangle.setHeight(5);
        System.out.println("h value: "+rectangle.getWidth());

        //Calculate area func and Calculate perimeter
        System.out.println("\nCalculate area func and Calculate perimeter");
        System.out.println("Rectangle area: "+rectangle.calculateArea());
        System.out.println("Rectangle perimeter: "+rectangle.calculateCircumference());

        System.out.println("-------------------------------------------------------------------------------------------------------------");

        //Triangle class
        System.out.println("\nTriangle class\n");
        Triangle triangle = new Triangle(0,0);

        //Accessors and Mutators
        System.out.println("Accessors and Mutators");
        System.out.println("h value: "+triangle.getHeight());
        triangle.setHeight(3);
        System.out.println("h value: "+triangle.getHeight());

        System.out.println();

        System.out.println("b value: "+triangle.getBase());
        triangle.setBase(10);
        System.out.println("b value: "+triangle.getBase());

        //Calculate area func and Calculate perimeter
        System.out.println("\nCalculate area func and Calculate perimeter");
        System.out.println("Triangle area: "+triangle.calculateArea());
        System.out.println("Triangle perimeter: "+triangle.calculateCircumference());
    }
}