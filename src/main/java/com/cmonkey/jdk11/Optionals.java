package com.cmonkey.jdk11;

import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        var foo = Optional.of("foo").orElseThrow();
        var count = Optional.of("foo").stream().count();

        System.out.println(foo);
        System.out.println(count);

        var op = Optional.ofNullable(null).or(() -> Optional.of("fallback")).get();

        System.out.println(op);
    }
}
