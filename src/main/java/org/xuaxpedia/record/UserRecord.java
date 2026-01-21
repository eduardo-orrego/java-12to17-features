package org.xuaxpedia.record;

/*
* A record in Java is a special type of class that is used to
* model immutable data. Records automatically generate boilerplate
* code such as constructors, accessors, equals(), hashCode(), and toString() methods.
* This makes them ideal for representing simple data carriers.
* Records were introduced in Java 14 as a preview feature and became a standard feature in Java 16.
*/
public record UserRecord(String username, String password) {

    public UserRecord {

        if (password.equals("123456"))  // referring here to the implicit constructor parameters
            throw new IllegalArgumentException("¡¡ password invalid !!");

    }

}
