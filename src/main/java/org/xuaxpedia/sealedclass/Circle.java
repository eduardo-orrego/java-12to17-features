package org.xuaxpedia.sealedclass;

/*
* A sealed class in Java is a special type of class that restricts which other classes or interfaces can extend or implement it.
* This feature was introduced in Java 15 as a preview and became a standard feature in Java
* 17. By using sealed classes, developers can have more control over the class hierarchy,
* enhancing encapsulation and maintainability. Sealed classes are declared using the 'sealed' keyword,
* and the permitted subclasses are specified using the 'permits' clause.
* In this example, Circle is a final class that extends the sealed class Shape.
*/
final class Circle extends Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

}
