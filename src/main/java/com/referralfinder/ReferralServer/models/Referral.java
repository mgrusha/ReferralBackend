package com.referralfinder.ReferralServer.models;

import javax.persistence.*;

@Entity
@Table(name = "referrals")
public class Referral {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "view_count")
    private Long viewCount;

    @Column
    private String url;

    @Column
    private String code;

    @Column
    private String description;

    @ManyToOne
    private Service service;

    public Long getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getViewCount() {
        return viewCount;
    }

    public void setViewCount(Long viewCount) {
        this.viewCount = viewCount;
    }
}
