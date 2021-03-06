package ch.fhnw.skyguide.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Coordinate {

    private Integer id;
    private String lat;
    private String lon;
    private Set<Drawing> drawings;

    public Coordinate() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    @ManyToMany(mappedBy = "coordinates")
    @JsonIgnore
    public Set<Drawing> getDrawings() {
        return drawings;
    }

    public void setDrawings(Set<Drawing> drawings) {
        this.drawings = drawings;
    }
}
