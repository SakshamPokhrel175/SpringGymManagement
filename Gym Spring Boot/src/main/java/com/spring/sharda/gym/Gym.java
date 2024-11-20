package com.spring.sharda.gym;

public class Gym {

    private String gymId;
    private String gymName;
    private String gymDescription;

    public Gym(String gymId, String gymName, String gymDescription) {
        this.gymId = gymId;
        this.gymName = gymName;
        this.gymDescription = gymDescription;
    }

    public String getGymId() {
        return gymId;
    }

    public void setGymId(String gymId) {
        this.gymId = gymId;
    }

    public String getGymName() {
        return gymName;
    }

    public void setGymName(String gymName) {
        this.gymName = gymName;
    }

    public String getGymDescription() {
        return gymDescription;
    }

    public void setGymDescription(String gymDescription) {
        this.gymDescription = gymDescription;
    }
}
