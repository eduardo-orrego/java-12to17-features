package org.xuaxpedia.sealedclass;

//A permitted subclass may be declared non-sealed so that its part of the hierarchy reverts to being open
//for extension by unknown subclasses. (A sealed class cannot prevent its permitted subclasses from doing this.)
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
