package org.xuaxpedia.sealedclass;

/*
* A sealed class in Java is a special type of class that restricts which other classes or interfaces can extend or implement it.
* This feature was introduced in Java 15 as a preview and became a standard feature in Java
* 17. By using sealed classes, developers can have more control over the class hierarchy,
* enhancing encapsulation and maintainability. Sealed classes are declared using the 'sealed' keyword
* , and the permitted subclasses are specified using the 'permits' clause.
* In this example, SealedClassDemo01 demonstrates the usage of sealed classes and their permitted subclasses.
* The main method creates an instance of Circle and calculates its area using the rotate method.
* The rotate method uses pattern matching with instanceof to determine the type of Shape
* and calls the appropriate calculateArea method.
* This example showcases how sealed classes can help manage class hierarchies and ensure type safety.
* Also demonstrates the different types of permitted subclasses:
* Rectangle is a sealed class with two permitted subclasses: TransparentRectangle and FilledRectangle.
* Square is a non-sealed class, allowing further extension without restrictions.
* Circle is a final class, preventing any further subclassing.
* Each shape class implements the calculateArea method to compute its area.
* This structure provides a clear and controlled hierarchy for geometric shapes.
*/

public class SealedClassDemo01 {

    public static void main(String[] args) {

        Shape circle = new Circle(1);
        double rotateShape = rotate(circle);
        System.out.println(rotateShape);

        Shape rectangle = new TransparentRectangle(2, 3);
        double rotateRectangle = rotate(rectangle);
        System.out.println(rotateRectangle);
        
        Shape square = new Square(4);
        double rotateSquare = rotate(square);
        System.out.println(rotateSquare);

    }

    static double rotate(Shape shape) {
        if (shape instanceof Circle circle) return circle.calculateArea();
        else if (shape instanceof Rectangle rectangle) return rectangle.calculateArea();
        else if (shape instanceof Square square) return square.calculateArea();
        else return 1.00;
    }

}

final class TransparentRectangle extends Rectangle {

    public TransparentRectangle(double width, double height) {
        super(width, height);

    }

}

final class FilledRectangle extends Rectangle {

    public FilledRectangle(double width, double height) {
        super(width, height);
    }

}
