package org.xuaxpedia.record;

/*
* This example demonstrates the basic usage of records in Java.
* It shows how to create a record, access its components,
* destructure it, and use it as constructor arguments for another record.
* Records are immutable data carriers that automatically generate
* boilerplate code such as constructors, accessors, equals(), hashCode(), and toString() methods.
* This makes them ideal for representing simple data structures in a concise manner.
*/

public class RecordDemo01 {

    public static void main(String[] args) {

        // Using a Record
        PersonRecord personRecord1 = new PersonRecord("Edward", 38, null);
        System.out.println(personRecord1.name());
        System.out.println(personRecord1.year());
        System.out.println(personRecord1.greeting());

        // Immutable by default
        // personRecord1.name = "Peter"; // Causes a compilation error

        // Destructuring records
        PersonRecord personRecord2 = new PersonRecord("Mary", 25, null);
        String name = personRecord2.name();
        int age = personRecord2.year();
        System.out.println("Destructuring records. Name: " + name + ", Age: " + age);

        // Can be used as constructor arguments
        PersonRecord fatherRecord = new PersonRecord("Carlos", 50, null);
        PersonRecord childRecord = new PersonRecord("Ana", 15, fatherRecord);
        System.out.println(childRecord.fatherRecord().name()); // Prints "Carlos"
    }

}


