package com.hope.donation_management;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DonationService {

    @Autowired
    private DonationRepository donationRepository;

    // Create a new donation
    public Donation createDonation(Donation donation) {
        return donationRepository.save(donation);
    }

    // Get donation details by ID
    public Donation getDonationById(String id) {
        return donationRepository.findById(id).orElse(null);
    }

    // List all donations by userId
    public List<Donation> getDonationsByUserId(String userId) {
        return donationRepository.findByUserId(userId);
    }
}