package com.referralfinder.ReferralServer.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="services")
public class Service {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    @Column
    private String description;

    @OneToMany
    private List<Referral> books;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Referral> getBooks() {
        return books;
    }

    public void setBooks(List<Referral> books) {
        this.books = books;
    }
}
