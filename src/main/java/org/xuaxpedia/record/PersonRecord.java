package org.xuaxpedia.record;

/*
* A record in Java is a special type of class that is used to
* model immutable data. Records automatically generate boilerplate
* code such as constructors, accessors, equals(), hashCode(), and toString() methods.
* This makes them ideal for representing simple data carriers.
* Records were introduced in Java 14 as a preview feature and became a standard feature in Java 16.
*/
public record PersonRecord(String name, int year, PersonRecord fatherRecord) {

    public String greeting() {

        return "Hello, my name is " + name + " and I am " + year + " years old.";

    }
}
