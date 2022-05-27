package httpClient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class PostRequest {

    //Retorna 405 Method Not Allowed

    //tentar preencher um formulário com os dados do json
    public static final String URL_POST = "http://httpbin.org/forms/post";
    //endereço do json com os dados dos campos do formulário
    public static final String FILE_JSON = "C:/Users/graciele.oliveira/ws-gitHub/dio-repository/exercicios-dio/pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {
        // cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        // criar a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();
    }
}
