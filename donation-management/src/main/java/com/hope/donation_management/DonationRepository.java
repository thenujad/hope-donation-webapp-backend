package com.hope.donation_management;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DonationRepository extends MongoRepository<Donation, String> {

    // Custom query to find donations by userId
    List<Donation> findByUserId(String userId);
}