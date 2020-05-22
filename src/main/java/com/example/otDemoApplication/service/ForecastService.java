package com.example.otDemoApplication.service;

import com.example.otDemoApplication.client.ForecastClient;
import com.example.otDemoApplication.model.ForecastDto;
import com.example.otDemoApplication.model.ForecastsDto;
import com.example.otDemoApplication.model.WeatherDetailDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ForecastService {

    @Autowired
    ForecastClient forecastClient;

    private static ForecastsDto allForecastData;

    private final Map<String, String> headers = new HashMap<String, String>() {
        {
            put("User-Agent", "Feign");
            put("Accept", "application/xml");
        }
    };

    @PostConstruct
    private void getAllForecastData() {
        allForecastData = forecastClient.getForeCastData(headers);
    }

    public List<String> getDates() {
        List<String> dateList = new ArrayList<>();
        allForecastData.getForeCastDtoList().stream().forEach(t -> dateList.add(t.getDate()));
        return dateList;
    }

    public WeatherDetailDto getWeatherDetail(String date, String time) {
        ForecastDto forecastDto = allForecastData.getForeCastDtoList().stream().filter(t -> t.getDate().equals(date)).findFirst().orElse(null);
        if (time.equals("Night")) {
            return forecastDto.getNightDto();
        }
        else if (time.equals("Day")) {
            return forecastDto.getDayDto();
        }
        else {
            return null;
        }
    }
}
