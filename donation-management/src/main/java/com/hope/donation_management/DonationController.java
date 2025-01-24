package com.hope.donation_management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    // Create a new donation
    @PostMapping
    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
        return ResponseEntity.ok(donationService.createDonation(donation));
    }

    // Retrieve donation details by ID
    @GetMapping("/{id}")
    public ResponseEntity<Donation> getDonation(@PathVariable String id) {
        return ResponseEntity.ok(donationService.getDonationById(id));
    }

    // List all donations by a specific user
    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Donation>> getDonationsByUserId(@PathVariable String userId) {
        return ResponseEntity.ok(donationService.getDonationsByUserId(userId));
    }
}

