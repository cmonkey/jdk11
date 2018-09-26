package com.cmonkey.jdk11;

import java.util.stream.Stream;

public class TestStream {

    public static void main(String[] args) {
        var count = Stream.ofNullable(null).count();

        System.out.println(count);
    }
}
