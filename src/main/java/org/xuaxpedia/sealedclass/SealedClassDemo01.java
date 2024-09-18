package org.xuaxpedia.sealedclass;

// Sealed classes, using the sealed keyword, allow defining which classes can inherit
// from a class or implement a specific interface. This offers precise control over
// the class hierarchy, ensuring that only a defined set of classes can extend or
// implement the sealed class or interface, promoting a more secure and predictable design.

public class SealedClassDemo01 {

    public static void main(String[] args) {

        Shape circle = new Circle(1);
        double rotateShape = rotate(circle);
        System.out.println(rotateShape);

    }

    static double rotate(Shape shape) {
        if (shape instanceof Circle) return shape.calculateArea();
        else if (shape instanceof Rectangle) return shape.calculateArea();
        else if (shape instanceof Square) return shape.calculateArea();
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
