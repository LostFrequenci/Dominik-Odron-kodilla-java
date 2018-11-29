package com.kodilla.good.patterns.challenges;

import java.util.stream.*;

public class MovieStoreStream {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        String movieTitle = movieStore.getMovies().values().stream()
                .flatMap(n -> n.stream())
                .collect(Collectors.joining("!","",""));
        System.out.println(movieTitle);
    }
}
