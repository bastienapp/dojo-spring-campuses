package com.wildcodeschool.campuses.model;
public class Campus {

    private String city;
    private String description;
    private String ourTeam;


    public Campus(String city, String description, String ourTeam) {
        this.city = city;
        this.description = description;
        this.ourTeam = ourTeam;
    }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    public String getDescription() { return description; }
    public void setDescription(String des) { this.description = des; }
    
    public String getOurTeam() { return ourTeam; }
    public void setOurTeam(String t) { this.ourTeam = t; }


}
