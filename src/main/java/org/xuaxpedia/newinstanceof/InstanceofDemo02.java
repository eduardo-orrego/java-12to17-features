package org.xuaxpedia.newinstanceof;

// Introduced in Java 14 and standardized in Java 16, pattern matching with instanceof
// simplifies type checking and casting into a single operation, allowing direct handling
// of object elements if the expression matches the specified type. This enhances code
// readability and safety by avoiding explicit casts and conversion errors.

public class InstanceofDemo02 {

    public static void main(String[] args) {

        Object object1 = "Before of Pattern Matching for instanceof";
        message(object1);

        Object object2 = true;
        message(object2);

        Object object3 = 13;
        message(object3);

    }

    static void message(Object object) {
        if (object instanceof String string) {
            System.out.println("result :" + string.length());
        } else if (object instanceof Boolean bol) {
            System.out.println("result : " + bol);
        } else {
            System.out.println("end");
        }
    }

}
