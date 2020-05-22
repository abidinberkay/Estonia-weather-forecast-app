package com.example.otDemoApplication.model;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

public class ForecastDto {

    private String date;
    private WeatherDetailDto nightDto;
    private WeatherDetailDto dayDto;

    public String getDate() {
        return date;
    }

    @XmlAttribute(name = "date")
    public void setDate(String date) {
        this.date = date;
    }

    public WeatherDetailDto getNightDto() {
        return nightDto;
    }

    @XmlElement(name = "night")
    public void setNightDto(WeatherDetailDto nightDto) {
        this.nightDto = nightDto;
    }

    public WeatherDetailDto getDayDto() {
        return dayDto;
    }

    @XmlElement(name = "day")
    public void setDayDto(WeatherDetailDto dayDto) {
        this.dayDto = dayDto;
    }


}
