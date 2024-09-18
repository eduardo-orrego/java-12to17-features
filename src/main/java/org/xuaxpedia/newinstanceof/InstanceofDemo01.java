package org.xuaxpedia.newinstanceof;

// Introduced in Java 14 and standardized in Java 16, pattern matching with instanceof
// simplifies type checking and casting into a single operation, allowing direct handling
// of object elements if the expression matches the specified type. This enhances code
// readability and safety by avoiding explicit casts and conversion errors.

public class InstanceofDemo01 {

    public static void main(String[] args) {

        Object object1 = "Before of Pattern Matching for instanceof";

        if (object1 instanceof String) {
            String string = (String) object1;
            int length = string.length();
            System.out.println("result 1 : " + length);
        }

        Object object2 = "Now with Pattern Matching for instanceof";

        if (object2 instanceof String string2) {
            int length2 = string2.length();
            System.out.println("result 2 : " + length2);
        }

    }

}
