import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/donations")
public class DonationController {

    @Autowired
    private DonationService donationService;

    @PostMapping
    public ResponseEntity<Donation> createDonation(@RequestBody Donation donation) {
        return ResponseEntity.ok(donationService.createDonation(donation));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Donation> getDonation(@PathVariable String id) {
        return ResponseEntity.ok(donationService.getDonationById(id));
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<List<Donation>> getUserDonations(@PathVariable String userId) {
        return ResponseEntity.ok(donationService.getDonationsByUserId(userId));
    }
}
