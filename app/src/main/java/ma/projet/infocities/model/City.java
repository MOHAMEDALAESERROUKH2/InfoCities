package ma.projet.infocities.model;

import java.io.Serializable;

public class City implements Serializable {
    private String name;
    private String country;
    private Long habitats;
    private int imageId;
    private int smallDesc;
    private int fullDesc;
    private int site;

    public City(String name, String country, Long habitats, int imageId, int smallDesc, int fullDesc, int site) {
        this.name = name;
        this.country = country;
        this.habitats = habitats;
        this.imageId = imageId;
        this.smallDesc = smallDesc;
        this.fullDesc = fullDesc;
        this.site = site;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Long getHabitats() {
        return habitats;
    }

    public void setHabitats(Long habitats) {
        this.habitats = habitats;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getSmallDesc() {
        return smallDesc;
    }

    public void setSmallDesc(int smallDesc) {
        this.smallDesc = smallDesc;
    }

    public int getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(int fullDesc) {
        this.fullDesc = fullDesc;
    }

    public int getSite() {
        return site;
    }

    public void setSite(int site) {
        this.site = site;
    }
}
