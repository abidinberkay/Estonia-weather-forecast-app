package com.example.otDemoApplication.model;

import javax.xml.bind.annotation.XmlElement;
import java.util.List;

public class WeatherDetailDto {

    private String phenomenon;
    private String tempMin;
    private String tempMax;
    private String text;
    private List<PlaceDto> placesDtos;
    private List<WindDto> windDtos;
    private String sea;
    private String peipsi;


    public String getPhenomenon() {
        return phenomenon;
    }

    @XmlElement(name = "phenomenon")
    public void setPhenomenon(String phenomenon) {
        this.phenomenon = phenomenon;
    }

    public String getTempMin() {
        return tempMin;
    }

    @XmlElement(name = "tempmin")
    public void setTempMin(String tempMin) {
        this.tempMin = tempMin;
    }

    public String getTempMax() {
        return tempMax;
    }

    @XmlElement(name = "tempmax")
    public void setTempMax(String tempMax) {
        this.tempMax = tempMax;
    }

    public String getText() {
        return text;
    }

    @XmlElement(name = "text")
    public void setText(String text) {
        this.text = text;
    }

    public List<PlaceDto> getPlacesDtos() {
        return placesDtos;
    }

    @XmlElement(name = "place")
    public void setPlacesDtos(List<PlaceDto> placesDtos) {
        this.placesDtos = placesDtos;
    }

    public List<WindDto> getWindDtos() {
        return windDtos;
    }

    @XmlElement(name = "wind")
    public void setWindDtos(List<WindDto> windDtos) {
        this.windDtos = windDtos;
    }

    public String getSea() {
        return sea;
    }

    @XmlElement(name = "sea")
    public void setSea(String sea) {
        this.sea = sea;
    }

    public String getPeipsi() {
        return peipsi;
    }

    @XmlElement(name = "peipsi")
    public void setPeipsi(String peipsi) {
        this.peipsi = peipsi;
    }
}
