package com.urwolfram.WeightTracker.services;

import com.urwolfram.WeightTracker.entities.Weight;
import com.urwolfram.WeightTracker.repositories.WeightRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeightService {

    private WeightRepository weightRepository;

    public WeightService(WeightRepository weightRepository){
        this.weightRepository = weightRepository;
    }

    public void addNewWeigth(Weight weight){
        weightRepository.save(weight);
    }


    public List<Weight> getWeights() {
        return weightRepository.findAll();
    }
}
