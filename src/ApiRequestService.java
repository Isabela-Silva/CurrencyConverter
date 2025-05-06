import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiRequestService {

    public CurrencyData fetchConvertionRates(String baseCode) throws IOException, InterruptedException {
        URI api = URI.create("https://v6.exchangerate-api.com/v6/417b91bf007b5d43befab067/latest/" + baseCode);

        HttpRequest request = HttpRequest.newBuilder().uri((api)).build();

        try {
            HttpResponse<String> response = HttpClient
                    .newHttpClient()
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), CurrencyData.class);
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Erro ao consultar CEP: " + e.getMessage());
        }

    }
}

