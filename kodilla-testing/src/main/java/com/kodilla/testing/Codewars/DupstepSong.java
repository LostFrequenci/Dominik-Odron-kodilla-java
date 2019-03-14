package com.kodilla.testing.Codewars;

public class DupstepSong {
    public static String SongDecoder(String song) {
        String words[];
        String separator = " ";
        words = song.split("WUB");

        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("")){
                continue;
            } else if ( i == words.length - 1) {
                builder.append(words[i]);
            } else {
            builder.append(words[i]).append(separator);
            }
        }
        return builder.toString();
    }
}
