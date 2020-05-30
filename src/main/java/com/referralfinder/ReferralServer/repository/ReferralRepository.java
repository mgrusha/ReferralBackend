package com.referralfinder.ReferralServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.referralfinder.ReferralServer.models.ReferralModel;

public interface ReferralRepository extends JpaRepository<ReferralModel, Long> {
}
