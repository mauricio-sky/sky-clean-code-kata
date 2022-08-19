package uk.sky.kata.cleancode.naming.example2;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class Client {

    private HttpClient client = getCloseableHttpClient();

    public HttpResponse send(String s) throws IOException {
        return client.execute(new HttpGet(s));
    }

    private static CloseableHttpClient getCloseableHttpClient() {
        return HttpClientBuilder.create().build();
    }
}
