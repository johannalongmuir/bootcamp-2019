package com.manchesterdigital;

import java.util.List;

public class AlbumChallenge {
    public static void main(String[] args) {
        Album kingOfDudes = new Album("King of the Dudes");
        Album thankUNext = new Album("Thank U, Next");
        Album iI = new Album("I, I");
        Album edgeOfLight = new Album("At the Edge of Light");
        Album arizonaBaby = new Album("Arizona Baby");


        List<Album> albums = List.of(kingOfDudes, thankUNext, iI, edgeOfLight, arizonaBaby);

        albums.stream()
                .filter(album -> album.getName().startsWith("A"))

                .forEach(System.out::println);

        // terminal, for each print.
        // guessed (Album::toString)
        // method System.out::println references method toString from Album class
        // don't tell how just what!
        // very different to object orientation
    }
}
