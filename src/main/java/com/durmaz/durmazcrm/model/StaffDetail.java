package com.durmaz.durmazcrm.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "staff_detail")
public class StaffDetail extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id", nullable = false, unique = true)
    private Staff staff;

    @Column(name = "salary", nullable = false)
    private double salary;

    @Column(name = "started_date", nullable = false)
    private LocalDateTime startedDate;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "address_id")
    private Address address;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_info_id")
    private ContactInformation contactInformation;

    @Column(name = "description", length = 255)
    private String description;

    public StaffDetail() {}

    public StaffDetail(Staff staff, double salary, LocalDateTime startedDate, Address address, ContactInformation contactInformation, String description) {
        this.staff = staff;
        this.salary = salary;
        this.startedDate = startedDate;
        this.address = address;
        this.contactInformation = contactInformation;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDateTime getStartedDate() {
        return startedDate;
    }

    public void setStartedDate(LocalDateTime startedDate) {
        this.startedDate = startedDate;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public ContactInformation getContactInformation() {
        return contactInformation;
    }

    public void setContactInformation(ContactInformation contactInformation) {
        this.contactInformation = contactInformation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
