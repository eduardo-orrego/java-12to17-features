package org.xuaxpedia.numberformatclass;

import java.text.CompactNumberFormat;
import java.text.NumberFormat;
import java.util.Locale;

// The JDK now supports compact number formatting, allowing large values
// to be represented more concisely and legibly, such as "1.2K" for one
// thousand or "1M" for one million. This is useful in constrained spaces
// like user interfaces or reports, providing a clear and efficient
// representation of numeric data without significant loss of precision.

public class NumberFormatClassDemo01 {

    public static void main(String[] args) {

        NumberFormat numberFormat = NumberFormat.getCompactNumberInstance(
                new Locale("en", "US"),
                NumberFormat.Style.SHORT
        );

        numberFormat.setMaximumFractionDigits(2);
        String number = numberFormat.format(5430000);
        System.out.println(number);

        NumberFormat numberFormat2 = CompactNumberFormat.getCompactNumberInstance(
                Locale.US,
                CompactNumberFormat.Style.SHORT
        );

        numberFormat2.setMaximumFractionDigits(2);
        String number2 = numberFormat2.format(15000);
        System.out.println(number2);

    }

}
