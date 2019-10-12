package com.manchesterdigital;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Arena {
    public static void main(String[] args) {
        Artist arianaGrande = new Artist("Ariana Grande",
                List.of(new Members("Ariana Grande")),
                        "London");
        Artist beatles = new Artist("Beatles",
                List.of(new Members("John Lennon"),
                        new Members("Paul MaCartney"),
                        new Members("Ringo Starr"),
                        new Members("George Harrison")),
                "Liverpool");
        Artist coldplay = new Artist("Coldplay",
                List.of(new Members("Chris Martin"),
                        new Members("Guy Berryman"),
                        new Members("Will Champion"),
                        new Members("Phil Harvey")),
                "London");










        List<Artist> artists = List.of(arianaGrande, beatles, coldplay);

        // non-stream
        long countFromLiverpool = 0;
        for(Artist artist : artists) {
            if (artist.isFrom("Liverpool")) {
                countFromLiverpool++;
            }

        }
        System.out.println("countFromLiverpool = " + countFromLiverpool);


        //Stream start with artists.stream then turn to .var. Long wrapperclass has a toInt
        Long numberOfArtistsFromLiverpool = artists.stream()
                .filter(artist -> artist.isFrom("Liverpool"))
                .filter(artist -> artist.getMembersList().size() > 2)
                .count(); // terminator for our stream
        System.out.println("numberOfArtistsFromLiverpool = " + numberOfArtistsFromLiverpool);


        // Stream of
        String result = Stream.of("a", "b", "c")
                .filter(s -> s.equalsIgnoreCase("a"))
                .findFirst().orElse("Alternative output, throw the new exception");

        System.out.println("result = " + result);

        // gathering match criteria to use maybe elsewhere: may want this list to pass to new method, whats good for you
        List<Artist> london = artists.stream()
                .filter(artist -> artist.isFrom("London")) // pulls out what has London
                .collect(Collectors.toList()); // terminator. New list called london can refer to

        // extract all artist names and print them. Could have combined this in above, List would be Strings
        // better to filter before map, saves it doing as much work.
        london.stream()
                .map(Artist::getName)
                .forEach(System.out::println);

        // at the moment printing member reference as no toString.
        // List needed to go into map to be able to flatmap.
        // extracting all members
        // consolidate all into stream by making flat map
        // once done that, what do you want me to do?

        List<Members> artistMembers = artists.stream()
                .map(Artist::getMembersList)
                .flatMap(Collection::stream)
                .collect(Collectors.toList());

        System.out.println("artistMembers = " + artistMembers);

        // sortings

        /*
        old way using comparator. Does in accending order. trying to sort an unchangeable list

        Collections.sort(artists, new Comparator<Artist>() {
            @Override
            public int compare(Artist o1, Artist o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });

         */

        // stream sorting better. after filtered maybe. .sorted is natural order
        // .sorted((o1, o2) -> o1.getName().compareTo(o2.getName()));
        // will go yellow

        Set<Artist> uniqueArtist = new HashSet<>(artists);
        artists.stream()
                .sorted(Comparator.comparing(Artist::getName));

        System.out.println("uniqueArtist = " + uniqueArtist);

        // Collections.sort(artists, Comparator.comparing(Artist::getName));



    } // end of PPSVM

} // end of class
