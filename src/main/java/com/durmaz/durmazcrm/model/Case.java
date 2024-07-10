package com.durmaz.durmazcrm.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "cases")
public class Case extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "subject", length = 255)
    private String subject;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public Case() {}

    public Case(Customer customer, LocalDateTime createdAt, String status, String subject, String description) {
        this.customer = customer;
        this.createdAt = createdAt;
        this.status = status;
        this.subject = subject;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
