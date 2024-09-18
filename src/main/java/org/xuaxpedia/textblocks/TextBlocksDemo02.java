package org.xuaxpedia.textblocks;

// Text blocks, standardized in Java 17, allow for more readable and convenient multi-line string
// representation. Using triple quotes ("""), they eliminate the need for concatenating strings
// or using escape sequences, facilitating the writing of extensive texts such as JSON, XML,
// or SQL queries in the desired format.

public class TextBlocksDemo02 {

    public static void main(String[] args) {

        String multiline = "Java 15 Features - New Text Blocks.";

        System.out.println(multiline);

        /*
            \s: to indicate a single space
            \: to indicate the end of the line, so that a new line character is not introduced
         */
        String multiline2 = """
                Java 15 Features \
                - New Text Blocks.""";

        System.out.println(multiline2);

    }

}
