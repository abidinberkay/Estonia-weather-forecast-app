package com.example.otDemoApplication.model;

import javax.xml.bind.annotation.XmlElement;

public class WindDto {

    private String name;
    private String direction;
    private String speedMin;
    private String speedMax;

    public String getName() {
        return name;
    }

    @XmlElement(name = "name")
    public void setName(String name) {
        this.name = name;
    }

    public String getDirection() {
        return direction;
    }

    @XmlElement(name = "direction")
    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getSpeedMin() {
        return speedMin;
    }

    @XmlElement(name = "speedmin")
    public void setSpeedMin(String speedMin) {
        this.speedMin = speedMin;
    }

    public String getSpeedMax() {
        return speedMax;
    }

    @XmlElement(name = "speedmax")
    public void setSpeedMax(String speedMax) {
        this.speedMax = speedMax;
    }
}
