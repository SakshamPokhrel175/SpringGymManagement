package com.spring.sharda.gym;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class GymService {

    private List<Gym> gyms = new ArrayList<>();

    public GymService() {
        gyms.add(new Gym("101", "Fitness Gym", "A place for all fitness enthusiasts"));
        gyms.add(new Gym("102", "Power Gym", "A power-packed gym with modern equipment"));
        gyms.add(new Gym("103", "Yoga Gym", "Focus on mind and body through yoga"));
    }

    public List<Gym> getGyms() {
        return gyms;
    }

    public Gym getGym(String id) {
        return gyms.stream().filter(gym -> gym.getGymId().equals(id)).findFirst().orElse(null);
    }

    public void addGym(Gym gym) {
        gyms.add(gym);
    }

    public void updateGym(String id, Gym gym) {
        for (int i = 0; i < gyms.size(); i++) {
            if (gyms.get(i).getGymId().equals(id)) {
                gyms.set(i, gym);
                return;
            }
        }
    }

    public void deleteGym(String id) {
        gyms.removeIf(gym -> gym.getGymId().equals(id));
    }
}
