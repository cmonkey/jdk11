package com.cmonkey.jdk11;

public class Strings {
    public static void main(String[] args) {
        var isBlank = " ".isBlank();

        System.out.println(isBlank);

        var strip = " Foo Bar ".strip();

        System.out.println(strip);

        var trailing = " Foo Bar ".stripTrailing();

        System.out.println(trailing);

        var leading = " Foo Bar ".stripLeading();

        System.out.println(leading);

        var repat = "Java".repeat(3);

        System.out.println(repat);

        var lineCount = "A\nB\nC\n".lines().count();

        System.out.println(lineCount);
    }
}
