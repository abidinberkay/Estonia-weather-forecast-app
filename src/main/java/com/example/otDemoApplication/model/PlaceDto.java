package com.example.otDemoApplication.model;

import javax.xml.bind.annotation.XmlElement;

public class PlaceDto {

    private String name;
    private String phenomenon;
    private String tempMin;
    private String tempMax;

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

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
}
