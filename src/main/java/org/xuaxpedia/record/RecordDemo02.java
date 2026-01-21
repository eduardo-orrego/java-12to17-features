package org.xuaxpedia.record;

/*
* This example demonstrates how to use records in Java to create
* immutable data carriers with built-in validation logic in the constructor.
* Here, we define a UserRecord that validates the password upon creation.
* If the password is "123456", an IllegalArgumentException is thrown.
* This ensures that only valid UserRecord instances can be created,
* enhancing data integrity and security.
*/

public class RecordDemo02 {

    public static void main(String[] args) {

        UserRecord userRecord = new UserRecord("admin", "123456");
        System.out.println("Username: " + userRecord.username());
    }

}
