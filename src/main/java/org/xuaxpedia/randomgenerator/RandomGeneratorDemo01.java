package org.xuaxpedia.randomgenerator;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

// New interfaces and classes for pseudo-random number generators have been added,
// improving flexibility and performance. These updates provide a wider range of
// algorithms and more detailed control over random number generation, optimizing
// randomization for applications that require high-quality results.

public class RandomGeneratorDemo01 {

    public static void main(String[] args) {

        //Create a pseudorandom number generator L64X128MixRandom
        RandomGenerator rng = RandomGenerator.of("L64X128MixRandom");

        //Generate 100 random numbers between 1 and 100
        IntStream.range(0, 100)
                .map(i -> rng.nextInt(101))
                .forEach(System.out::println);

    }

}
