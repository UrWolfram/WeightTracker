package com.urwolfram.WeightTracker.entities;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "weight_entries")
public class Weight {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private float weight;

    @Column(nullable = false)
    private LocalDate weightedAt;

    @Column(length = 200)
    private String note;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public Weight(){

    }

    public Weight(Integer id, float weight, LocalDate weightedAt, String note, User user) {
        this.id = id;
        this.weight = weight;
        this.weightedAt = weightedAt;
        this.note = note;
        this.user = user;
    }

    public LocalDate getWeightedAt() {
        return weightedAt;
    }

    public void setWeightedAt(LocalDate weightedAt) {
        this.weightedAt = weightedAt;
    }

    public float getWeigth() {
        return weight;
    }

    public void setWeigth(float weigth) {
        this.weight = weigth;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
