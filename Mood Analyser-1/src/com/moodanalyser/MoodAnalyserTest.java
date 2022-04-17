package com.moodanalyser;

import org.junit.Test;
import org.junit.Assert;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();


    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy(){
        String mood = moodAnalyser.analyseMood("I am in any mood");
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        Assert.assertEquals("Happy",mood);
    }
}