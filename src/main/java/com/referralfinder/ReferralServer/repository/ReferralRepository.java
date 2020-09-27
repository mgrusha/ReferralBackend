package com.referralfinder.ReferralServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.referralfinder.ReferralServer.models.Referral;

public interface ReferralRepository extends JpaRepository<Referral, Long> {
}
