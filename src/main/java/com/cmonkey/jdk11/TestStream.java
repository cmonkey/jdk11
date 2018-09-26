package com.cmonkey.jdk11;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        var count = Stream.ofNullable(null).count();

        System.out.println(count);

        var dropList = Stream.of(1,2,3,2,1)
                .dropWhile(n -> n < 3)
                .collect(Collectors.toList());

        dropList.forEach(item -> System.out.println(item));

        var takeList = Stream.of(1,2,3,2,1)
            .takeWhile(n -> n < 3)
            .collect(Collectors.toList());

        takeList.forEach(item -> System.out.println(item));
    }
}
