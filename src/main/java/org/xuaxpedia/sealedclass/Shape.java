package org.xuaxpedia.sealedclass;

/*
* A sealed class in Java is a special type of class that restricts which other classes or interfaces can extend or implement it.
* This feature was introduced in Java 15 as a preview and became a standard feature in Java
* 17. By using sealed classes, developers can have more control over the class hierarchy,
* enhancing encapsulation and maintainability. Sealed classes are declared using the 'sealed' keyword
* , and the permitted subclasses are specified using the 'permits' clause.
* In this example, Shape is a sealed class that serves as a base for different geometric shapes
*/
abstract sealed class Shape permits Circle, Rectangle, Square {

    // Define common methods and attributes for all forms.
    public abstract double calculateArea();

}