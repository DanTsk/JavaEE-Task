package com.mycompany.app.entities;

import javax.persistence.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Entity
public class CD {
    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private Float price;
    private String description;

    @Lob
    private byte[] cover;

    @ManyToMany(mappedBy = "appearsOnCDs")
    private List<Artist> createdByArtists;


    @ElementCollection
    @CollectionTable(name="track")
    @MapKeyColumn (name = "position")
    @Column(name = "title")
    private Map<Integer, String> tracks = new HashMap<Integer, String>();

    public CD(String title, Float price, String description, byte[] cover) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.cover = cover;
    }

    public CD() {
    }

    public Map<Integer, String> getTracks() {
        return tracks;
    }

    public void setTracks(Map<Integer, String> tracks) {
        this.tracks = tracks;
    }

    public byte[] getCover() {
        return cover;
    }

    public void setCover(byte[] cover) {
        this.cover = cover;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Artist> getCreatedByArtists() {
        return createdByArtists;
    }

    public void setCreatedByArtists(List<Artist> createdByArtists) {
        this.createdByArtists = createdByArtists;
    }
}
