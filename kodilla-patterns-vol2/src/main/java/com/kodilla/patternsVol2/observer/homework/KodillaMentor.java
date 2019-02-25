package com.kodilla.patternsVol2.observer.homework;

public class KodillaMentor implements KodillaObserver {
    private final String mentorName;
    private int updateCount;

    public KodillaMentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(KodillaTasks kodillaTasks) {
        String taskString = new String("");
        updateCount++;
        if (updateCount == 1){
            taskString = "task";
        } else { taskString = "tasks";}

        System.out.println(mentorName + " have " + updateCount + " " + taskString + " to check.");

    }

    public String getMentorName() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
