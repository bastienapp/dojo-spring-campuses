package com.wildcodeschool.campuses.model;

public class Campus {

    private String city;
    private String description;
    private String link;
    
    public Campus(String city, String description, String link) {

        this.city = city;
        this.description = description;
        this.link = link;
    }

    public String getCity() {

        return city;
    }

    public void setCity(String newCity) {

        this.city = newCity;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return this.link;
    }

    public void setLink(String link) {
        this.link = link;
    }


}
