package org.sukla.inter;

import java.util.Arrays;
import java.util.List;

public class M1 {
    public static void main(String[] args) {

        List<Integer>  list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> even = list.stream().filter(x -> x % 2 == 0).toList();
        System.out.println(even);

    }
}
