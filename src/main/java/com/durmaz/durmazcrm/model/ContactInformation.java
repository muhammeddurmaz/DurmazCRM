package com.durmaz.durmazcrm.model;

import jakarta.persistence.*;
@Entity
@Table(name = "contact_information")
public class ContactInformation extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "email", length = 255)
    private String email;

    @Column(name = "phone_number", length = 20)
    private String phoneNumber;

    @Column(name = "landline_number", length = 20)
    private String landlineNumber;

    public ContactInformation() {}

    public ContactInformation(String email, String phoneNumber, String landlineNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.landlineNumber = landlineNumber;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLandlineNumber() {
        return landlineNumber;
    }

    public void setLandlineNumber(String landlineNumber) {
        this.landlineNumber = landlineNumber;
    }
}
