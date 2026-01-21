package org.xuaxpedia.sealedclass;

/*
* A sealed class in Java is a special type of class that restricts which other classes or interfaces can extend or implement it.
* This feature was introduced in Java 15 as a preview and became a standard feature in Java
* 17. By using sealed classes, developers can have more control over the class hierarchy,
* enhancing encapsulation and maintainability. Sealed classes are declared using the 'sealed' keyword
* , and the permitted subclasses are specified using the 'permits' clause.
* In this example, Rectangle is a sealed class that extends the sealed class Shape
*/
sealed class Rectangle extends Shape permits TransparentRectangle, FilledRectangle {

    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

}