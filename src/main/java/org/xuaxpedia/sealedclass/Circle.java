package org.xuaxpedia.sealedclass;

//A permitted subclass may be declared final to prevent its part of the class hierarchy from being extended further.
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
