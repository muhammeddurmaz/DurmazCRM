package com.durmaz.durmazcrm.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "events")
public class Event extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "staff_id", nullable = false)
    private Staff staff;

    @Column(name = "subject", length = 255)
    private String subject;

    @Column(name = "event_date")
    private LocalDateTime eventDate;

    @Column(name = "location", length = 100)
    private String location;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "status", length = 50)
    private String status;

    @Column(name = "reminder_datetime")
    private LocalDateTime reminderDateTime;

    @Column(name = "reminder_set")
    private boolean reminderSet;

    public Event() {
    }

    public Event(Staff staff, String subject, LocalDateTime eventDate, String location, String description, String status, LocalDateTime reminderDateTime, boolean reminderSet) {
        this.staff = staff;
        this.subject = subject;
        this.eventDate = eventDate;
        this.location = location;
        this.description = description;
        this.status = status;
        this.reminderDateTime = reminderDateTime;
        this.reminderSet = reminderSet;
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getEventDate() {
        return eventDate;
    }

    public void setEventDate(LocalDateTime eventDate) {
        this.eventDate = eventDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getReminderDateTime() {
        return reminderDateTime;
    }

    public void setReminderDateTime(LocalDateTime reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
    }

    public boolean isReminderSet() {
        return reminderSet;
    }

    public void setReminderSet(boolean reminderSet) {
        this.reminderSet = reminderSet;
    }
}