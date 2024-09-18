package org.xuaxpedia.stringmethod;


// The transform() method in the String class allows applying
// lambda functions or method references to a string to obtain
// its transformation. It facilitates string manipulation and
// improves code readability by enabling common operations
// like case conversion and format adjustments concisely.

public class StringMethodDemo02 {

    public static void main(String[] args) {

        String text = "Java 12 features";
        String transformed = text.transform(value -> new StringBuilder(value).reverse().toString());
        System.out.println(transformed);

    }

}
