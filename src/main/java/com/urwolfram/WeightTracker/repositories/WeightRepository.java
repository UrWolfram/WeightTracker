package com.urwolfram.WeightTracker.repositories;

import com.urwolfram.WeightTracker.entities.Weight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;

public interface WeightRepository extends JpaRepository<Weight, Integer> {
}
