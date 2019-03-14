package com.kodilla.testing.DupstepSong;

import com.kodilla.testing.Codewars.DupstepSong;
import org.junit.Test;
import static org.junit.Assert.*;

public class DupstepSongTest {
    @Test
    public void DupstepSongCheckerTest(){
        //Given
        DupstepSong song = new DupstepSong();

        //When
        String test = song.SongDecoder("WUBWUBABCWUB");
        //Then
        assertEquals("ABC",test);

    }
}
