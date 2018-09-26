package com.cmonkey.jdk11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        var count = Stream.ofNullable(null).count();

        System.out.println(count);

        var list = Stream.of(1,2,3,2,1)
                .dropWhile(n -> n < 3)
                .collect(Collectors.toList());

        list.forEach(item -> System.out.println(item));
    }
}
