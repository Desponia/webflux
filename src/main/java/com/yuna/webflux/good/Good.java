package com.yuna.webflux.good;

public class Good {
    private String avg;
    private String name;

    public Good() {}

    public Good(String avg, String name) {
        this.avg = avg;
        this.name = name;
    }

    public String getAvg() {
        return avg;
    }

    public void setAvg(String avg) {
        this.avg = avg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Good{" +
                "avg='" + avg + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
