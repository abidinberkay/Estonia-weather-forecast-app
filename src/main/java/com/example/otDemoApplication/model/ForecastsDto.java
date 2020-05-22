package com.example.otDemoApplication.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "forecasts")
public class ForecastsDto {

    private List<ForecastDto> foreCastDtoList;

    public List<ForecastDto> getForeCastDtoList() {
        return foreCastDtoList;
    }

    @XmlElement(name = "forecast")
    public void setForeCastDtoList(List<ForecastDto> foreCastDtoList) {
        this.foreCastDtoList = foreCastDtoList;
    }
}
