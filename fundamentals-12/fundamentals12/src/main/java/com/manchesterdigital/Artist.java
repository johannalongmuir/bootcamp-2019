package com.manchesterdigital;

import java.util.List;

public class Artist {
    private final String name;
    private final List<Members> membersList;
    private final String location;
    private String song;
    private String album;

    public Artist(String name, List<Members> membersList, String location) {
        this.name = name;
        this.membersList = membersList;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public List<Members> getMembersList() {
        return membersList;
    }

    public String getLocation() {
        return location;
    }

    public String getSong() {
        return song;
    }

    public void setSong(String song) {
        this.song = song;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public boolean isFrom(String locationRequired) {
        return location.equalsIgnoreCase(locationRequired);
    }

    @Override
    public String toString() {
        return "Artist{" +
                "name='" + name + '\'' +
                ", membersList=" + membersList +
                ", location='" + location + '\'' +
                ", song='" + song + '\'' +
                ", album='" + album + '\'' +
                '}';
    }
}
