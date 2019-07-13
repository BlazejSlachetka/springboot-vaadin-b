package pl.sda.springbootvaadinb;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class CatGifClient {


    public String getCatGifFormApi() {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<CatGif> exchangeGif;
        while (true) {
            exchangeGif =
                    restTemplate.exchange("https://aws.random.cat/meow",
                            HttpMethod.GET,
                            HttpEntity.EMPTY,
                            CatGif.class);
            if (exchangeGif.getBody().getFile().endsWith("gif")) {
                return exchangeGif.getBody().getFile();

            }
        }
    }
}
