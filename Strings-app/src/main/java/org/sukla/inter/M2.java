package org.sukla.inter;

import java.util.Random;
import java.util.stream.Stream;

/*
*Generate Random numbers upto 20 using Streams 
* */
public class M2 {
    public static void main(String[] args) {
        Stream<Integer>  randomNumbers = Stream.generate(() -> new Random().nextInt(100));
        randomNumbers.limit(20).forEach(System.out ::println);
    }
}
