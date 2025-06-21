package com.example.irisbackend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "iris")
public class Iris {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double sepalLength;
    private double sepalWidth;
    private double petalLength;
    private double petalWidth;
    private String species;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getSepalLength() { return sepalLength; }
    public void setSepalLength(double sepalLength) { this.sepalLength = sepalLength; }

    public double getSepalWidth() { return sepalWidth; }
    public void setSepalWidth(double sepalWidth) { this.sepalWidth = sepalWidth; }

    public double getPetalLength() { return petalLength; }
    public void setPetalLength(double petalLength) { this.petalLength = petalLength; }

    public double getPetalWidth() { return petalWidth; }
    public void setPetalWidth(double petalWidth) { this.petalWidth = petalWidth; }

    public String getSpecies() { return species; }
    public void setSpecies(String species) { this.species = species; }
}
