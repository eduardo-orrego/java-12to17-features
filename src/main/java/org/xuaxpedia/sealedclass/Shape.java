package org.xuaxpedia.sealedclass;

abstract sealed class Shape permits Circle, Rectangle, Square {

    // Define common methods and attributes for all forms.
    public abstract double calculateArea();

}