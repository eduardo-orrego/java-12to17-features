package org.xuaxpedia.sealedclass;

/*
* A sealed class in Java is a special type of class that restricts which other classes or interfaces can extend or implement it.
* This feature was introduced in Java 15 as a preview and became a standard feature in Java
* 17. By using sealed classes, developers can have more control over the class hierarchy,
* enhancing encapsulation and maintainability. Sealed classes are declared using the 'sealed' keyword
* , and the permitted subclasses are specified using the 'permits' clause.
* In this example, Square is a non-sealed class that extends the sealed class Shape.
* A non-sealed class allows further extension without restrictions.
*/
non-sealed class Square extends Shape {

    private final double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }

}
