package ru.geekbrains;

import java.util.ArrayList;
import java.util.Arrays;

public class Race {
    private ArrayList<Stage> stages;
    private boolean isFinished;
    public ArrayList<Stage> getStages() { return stages; }
    public Race(Stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
        this.isFinished = false;
    }

    public boolean checkIsRaceFinished() {
        return isFinished;
    }

    public void setRaceFinished() {
        isFinished = true;
    }
}
