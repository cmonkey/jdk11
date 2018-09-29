package com.cmonkey.jdk11;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

import static java.net.http.HttpResponse.BodyHandlers.ofString;

public class TestHttpClient {

    public static void main(String[] args) {
        var httpClient = HttpClient.newHttpClient();

        var httpRequest = HttpRequest.newBuilder()
                .uri(URI.create("http://localhost:8010"))
                .timeout(Duration.ofSeconds(20))
                .header("Content-Type", "application/json")
                .build();

        syncHttp(httpClient, httpRequest);
        asyncHttp(httpClient, httpRequest);
    }

    private static void syncHttp(HttpClient httpClient, HttpRequest httpRequest){

        try {
            var json = httpClient.send(httpRequest, ofString())
                    .body();
            System.out.println("sync call api result = " + json);
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void asyncHttp(HttpClient httpClient, HttpRequest httpRequest){
        AtomicReference<String> json = new AtomicReference<>("");
        var httpResponse = httpClient.sendAsync(httpRequest, ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(json::set);

        httpResponse.join();

        System.out.println("async call api result = " + json.get());
    }
}
