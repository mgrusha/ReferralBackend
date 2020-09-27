package com.referralfinder.ReferralServer.repository;

import com.referralfinder.ReferralServer.models.Referral;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "referrals", path = "referrals")
public interface ReferralRepository extends PagingAndSortingRepository<Referral, Long> {
}
