package com.cmonkey.jdk11;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreams {
    public static void main(String[] args) throws IOException {
        var classLoader = ClassLoader.getSystemClassLoader();

        var inputStream = classLoader.getResourceAsStream("myfile.txt");

        var tempFile = File.createTempFile("myFileCopy", "txt");

        try(var outputStrema = new FileOutputStream(tempFile)){
            inputStream.transferTo(outputStrema);
        }
    }
}
