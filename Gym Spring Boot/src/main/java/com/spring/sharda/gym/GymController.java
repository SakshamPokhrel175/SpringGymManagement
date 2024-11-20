package com.spring.sharda.gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/gyms")
public class GymController {

    @Autowired
    private GymService gymService;

    @GetMapping
    public List<Gym> getAllGyms() {
        return gymService.getGyms();
    }

    @GetMapping("/{id}")
    public Gym getGymById(@PathVariable String id) {
        return gymService.getGym(id);
    }

    @PostMapping
    public void addGym(@RequestBody Gym gym) {
        gymService.addGym(gym);
    }

    @PutMapping("/{id}")
    public void updateGym(@PathVariable String id, @RequestBody Gym gym) {
        gymService.updateGym(id, gym);
    }

    @DeleteMapping("/{id}")
    public void deleteGym(@PathVariable String id) {
        gymService.deleteGym(id);
    }
}
