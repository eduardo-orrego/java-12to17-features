package org.xuaxpedia.collectorsmethod;

import java.util.stream.Collectors;
import java.util.stream.Stream;

// Introduced in Java 12, the teeing() method combines two collectors into
// one to collect data from a stream in two different ways simultaneously.
// It splits the stream into two collectors, processes each independently,
// and combines the results into a single final value, improving efficiency
// and clarity by avoiding processing the stream twice.

public class CollectorsMethodDemo01 {

    public static void main(String[] args) {

        /*
            Collectors.teeing() .-
            Returns a Collector that is a composite of two downstream collectors.
            Every element passed to the resulting collector is processed by both downstream collectors,
            then their results are merged using the specified merge function into the final result.
        */
        double mean = Stream.of(1, 2, 3, 4, 5)
                .collect(
                        Collectors.teeing(
                                Collectors.summingDouble(i -> i),
                                Collectors.counting(),
                                (sum, count) -> sum / count
                        )
                );

        System.out.println(mean);

    }

}
