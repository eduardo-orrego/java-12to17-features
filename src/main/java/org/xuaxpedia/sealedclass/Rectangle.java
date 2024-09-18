package org.xuaxpedia.sealedclass;

//A permitted subclass may be declared sealed to allow its part of the hierarchy to be extended further
//than envisaged by its sealed superclass, but in a restricted fashion.
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