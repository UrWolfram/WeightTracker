package com.urwolfram.WeightTracker.controllers;

import com.urwolfram.WeightTracker.entities.Weight;
import com.urwolfram.WeightTracker.services.WeightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/weights")
public class WeigthController {

    private WeightService weightService;

    public WeigthController(WeightService weightService) {
        this.weightService = weightService;
    }

    @PostMapping(path = "/addWeight")
    public void addNewWeight(@RequestBody Weight weight){
        weightService.addNewWeigth(weight);
    }

    @GetMapping("/getWeights")
    public List<Weight> getWeights(){
        return weightService.getWeights();
    }

}
