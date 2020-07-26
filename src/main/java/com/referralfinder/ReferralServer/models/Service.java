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
}
