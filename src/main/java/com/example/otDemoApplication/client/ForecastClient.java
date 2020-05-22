package com.example.otDemoApplication.client;

import com.example.otDemoApplication.model.ForecastsDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Map;

public interface ForecastClient {


    @GetMapping("/ilma_andmed/xml/forecast.php?lang=eng")
    ForecastsDto getForeCastData(@RequestHeader Map<String, String> headerMap);
}
