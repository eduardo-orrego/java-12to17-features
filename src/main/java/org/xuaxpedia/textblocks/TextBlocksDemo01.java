package org.xuaxpedia.textblocks;

// Text blocks, standardized in Java 17, allow for more readable and convenient multi-line string
// representation. Using triple quotes ("""), they eliminate the need for concatenating strings
// or using escape sequences, facilitating the writing of extensive texts such as JSON, XML,
// or SQL queries in the desired format.

public class TextBlocksDemo01 {

    public static void main(String[] args) {

        String multiline = "Java 14 Features - New Text Blocks - Preview Features.";

        System.out.println(multiline);

        /*
            \s: to indicate a single space
            \: to indicate the end of the line, so that a new line character is not introduced
         */
        String multiline2 = """
                Java 14 Features\s\
                - New Text Blocks\s\
                - Preview Features.""";

        System.out.println(multiline2);


        System.out.println("-----Using 'one-dimensional' string literals-----");

        String html = "<html>\n" +
                "    <body>\n" +
                "        <p>Hello, world</p>\n" +
                "    </body>\n" +
                "</html>\n";
        System.out.println(html);

        System.out.println("-----Using a 'two-dimensional' block of text-----");

        String html2 = """
                <html>
                    <body>
                        <p>Hello, world</p>
                    </body>
                </html>
                """;

        System.out.println(html2);

    }

}
