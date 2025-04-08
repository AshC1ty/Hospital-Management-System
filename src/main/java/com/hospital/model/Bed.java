package com.hospital.model;

import jakarta.persistence.*;

@Entity
@Table(name = "beds")
public class Bed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bed_id")
    private int bedId;

    @Column(name = "bed_number", unique = true, nullable = false, length = 20)
    private String bedNumber;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status = Status.AVAILABLE;

    public enum Status {
        AVAILABLE, OCCUPIED
    }

    // Constructors
    public Bed() {}

    public Bed(String bedNumber, Status status) {
        this.bedNumber = bedNumber;
        this.status = status;
    }

    // Getters and Setters
    public int getBedId() { return bedId; }
    public String getBedNumber() { return bedNumber; }
    public void setBedNumber(String bedNumber) { this.bedNumber = bedNumber; }
    public Status getStatus() { return status; }
    public void setStatus(Status status) { this.status = status; }
}
