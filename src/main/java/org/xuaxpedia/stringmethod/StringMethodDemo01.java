package org.xuaxpedia.stringmethod;

// The indent() method adjusts the indentation of a string by
// adding or removing spaces at the beginning of each line,
// facilitating content alignment and organization. It is useful
// for formatting multi-line text blocks, enhancing readability
// in documents and source code.

public class StringMethodDemo01 {

    public static void main(String[] args) {

        String text = "Java 12 features\nString Class\nindent method";

        text = text.indent(4);
        System.out.println(text);

        text = text.indent(-3);
        System.out.println(text);

        text = text.indent(-5);
        System.out.println(text);

    }

}
