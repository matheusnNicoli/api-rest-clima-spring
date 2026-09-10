package com.example.demo.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class service {

    public String preverTempo() {

        String apiUrl =
            "https://api.open-meteo.com/v1/forecast"
            + "?latitude=-19.9208"
            + "&longitude=-43.9378"
            + "&daily=temperature_2m_max,temperature_2m_min"
            + "&current=temperature_2m,relative_humidity_2m,weather_code,"
            + "wind_speed_10m,wind_direction_10m"
            + "&timezone=auto";

        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<String> responseEntity =
            restTemplate.getForEntity(apiUrl, String.class);

        if (responseEntity.getStatusCode().is2xxSuccessful()) {
            return responseEntity.getBody();
        } else {
            return "Falha ao obter dados meteorológicos. Código: "
                    + responseEntity.getStatusCode();
        }
    }
}