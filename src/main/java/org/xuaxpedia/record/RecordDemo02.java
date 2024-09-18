package org.xuaxpedia.record;

// Records allow defining immutable classes for efficient data transfer, automating
// the generation of methods such as equals(), hashCode(), and toString(), as well
// as a constructor and getter methods. The immutability of records eliminates the
// need for setters, simplifying the creation of data classes and improving code
// clarity and maintainability.

public class RecordDemo02 {

    public static void main(String[] args) {

        UserRecord userRecord = new UserRecord("admin", "123456");

    }

}
