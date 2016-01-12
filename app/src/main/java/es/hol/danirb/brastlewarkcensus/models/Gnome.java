package es.hol.danirb.brastlewarkcensus.models;

import java.io.Serializable;
import java.util.List;


public class Gnome implements Serializable {
    private int id;
    private String name;
    private String thumbnail;
    private int age;
    private double weight;
    private double height;
    private String hair_color;
    private List<String> professions;
    private List<String> friends;

    public Gnome(int id, String name, String thumbnail, int age, double weight,
                 double height, String hair_color, List<String> professions, List<String> friends) {
        this.id = id;
        this.name = name;
        this.thumbnail = thumbnail;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.hair_color = hair_color;
        this.professions = professions;
        this.friends = friends;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPicture() {
        return thumbnail;
    }

    public void setPicture(String picture) {
        this.thumbnail = picture;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public List<String> getProfessions() {
        return professions;
    }

    public void setProfessions(List<String> professions) {
        this.professions = professions;
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Gnome{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", thumbnail='" + thumbnail + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                ", hair_color='" + hair_color + '\'' +
                ", professions=" + professions +
                ", friends=" + friends +
                '}';
    }
}
